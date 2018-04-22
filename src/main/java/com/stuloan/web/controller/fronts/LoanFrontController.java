package com.stuloan.web.controller.fronts;

import com.stuloan.web.mybatis.domain.*;
import com.stuloan.web.mybatis.domain.inte.*;
import com.stuloan.web.util.CommonUtil;
import com.stuloan.web.util.Userutils;
import com.stuloan.web.util.Userutils4mybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by suyx on 2018-04-21.
 */
@Controller
@RequestMapping(value = "/loan")
public class LoanFrontController {

    @Autowired
    private LoanMapper loanMapper;
    @Autowired
    private StudentinfoMapper studentinfoMapper;
    @Autowired
    private StagefeeMapper stagefeeMapper;

    @Autowired
    private SysuserMapper sysuserMapper;

    @Autowired
    private RepaydetailMapper repaydetailMapper;

    @RequestMapping(value = "/applyloan")
    public ModelAndView applyloan(Model model, HttpServletRequest request){

        try {
            Sysuser sysuser = Userutils4mybatis.getcookieuser(request,Userutils.FRONG_COOKIE_NAME);
            model.addAttribute("sysuser", sysuser);

            Studentinfo studentinfo = new Studentinfo();
            studentinfo.setUserid(sysuser.getId());
            List<Studentinfo> list = studentinfoMapper.selectByParams(studentinfo);
            if(list != null && list.size() > 0){
                studentinfo = list.get(0);
            }
            model.addAttribute("studentinfo",studentinfo);

        }catch (Exception e){
            e.printStackTrace();
        }

        return new ModelAndView("/fronts/applyloan");
    }

    @RequestMapping(value = "/toapplyloan")
    public ModelAndView toapplyloan(Loan loan, HttpServletRequest request){
        Map<String,Object> result = new HashMap<>();
        result.put("code",0);
        result.put("message","提交失败");
        try{
            loan.setId(CommonUtil.uuid());
            loan.setIsstage("1");
            loan.setCreatedate(new Date());

            int loanage = loan.getLoanage();
            double loanamount = loan.getLoanamount();
            double fee = stagefeeMapper.selectfeeByage(loanage + "");
            double repaytotal = (loanamount * fee / 100) + loanamount;

            loan.setRepayyet(0.0);
            loan.setStagenum(loan.getLoanage());
            loan.setRepayreal(repaytotal);
            loan.setState("0");
            loan.setUserid(Userutils.getuserid(request,Userutils.FRONG_COOKIE_NAME));
            int i = loanMapper.insert(loan);

            double avgrepay = repaytotal / loanage;
            for(int k=0;k<loanage;k++){
                Repaydetail repaydetail = new Repaydetail();
                repaydetail.setId(CommonUtil.uuid());
                repaydetail.setLoanid(loan.getId());
                repaydetail.setState("0");
                repaydetail.setStagenum(k+1);
                repaydetail.setRepaymoney(avgrepay);
                repaydetail.setRepaydateplan(CommonUtil.ObjToDate(CommonUtil.subMonthfromamount(CommonUtil.getDateLong(),(k+1))));
                repaydetailMapper.insert(repaydetail);
            }

            result.put("code",1);
            result.put("message","提交成功");
        }catch (Exception e){
            result.put("code",0);
            result.put("message","提交失败");
        }
        return new ModelAndView("/fronts/myloan");
    }

    @RequestMapping(value = "/toidentity")
    @ResponseBody
    public Object toidentity(HttpServletRequest request){
        Map<String,Object> result = new HashMap<>();
        result.put("code",0);
        result.put("message","保存失败");

        try {
            Studentinfo studentinfo = new Studentinfo();
            studentinfo.setId(CommonUtil.uuid());
            studentinfo.setUserid(Userutils.getuserid(request,Userutils.FRONG_COOKIE_NAME));
            int i = studentinfoMapper.insertSelective(studentinfo);

            Sysuser sysuser = Userutils4mybatis.getcookieuser(request,Userutils4mybatis.FRONG_COOKIE_NAME);
            sysuser.setIsstuidentity("1");
            i += sysuserMapper.updateByPrimaryKey(sysuser);
            result.put("code",1);
            result.put("message","已申请");
        }catch (Exception e){
            result.put("code",0);
            result.put("message","保存失败");
        }

        return result;
    }

    @RequestMapping(value = "getfeefromage")
    @ResponseBody
    public Object getfeefromage(@RequestParam Map<String,Object> params){
        Map<String,Object> result = new HashMap<>();
        result.put("code",0);

        try {
            List<Stagefee> list1 = stagefeeMapper.selectByParams(params);
            result.put("stagefee",list1.get(0));
            result.put("code",1);
        }catch (Exception e){
            e.printStackTrace();
            result.put("code",0);
        }

        return result;
    }

}
package com.stuloan.web.controller.consoles;

import com.stuloan.web.mybatis.domain.*;
import com.stuloan.web.mybatis.domain.inte.*;
import com.stuloan.web.util.CommonUtil;
import com.stuloan.web.util.Userutils;
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
@RequestMapping(value = "/consoles")
public class LoanController {

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

    @RequestMapping(value = "/loan")
    public ModelAndView applyloan(Model model, HttpServletRequest request){
        return new ModelAndView("/consoles/loan");
    }

    @RequestMapping(value = "/loanlist")
    @ResponseBody
    public Object loanlist(HttpServletRequest request, @RequestParam Map<String,Object> params){
        Map<String,Object> result = new HashMap<>();
        result.put("total",0);
        int totalcount = loanMapper.selectCountByParams(params);
        result.put("rows",totalcount);
        List<Map<String,Object>> list = loanMapper.selectByParams02(params);
        result.put("rows",list);
        return result;
    }

    @RequestMapping(value = "/auditloan")
    @ResponseBody
    public Object auditloan(HttpServletRequest request, String ids, String state, String auditmsg){
        Map<String,Object> result = new HashMap<>();
        result.put("code",0);
        result.put("message","系统错误，请联系管理员");

        try {
            String[] idarr = ids.split(",");
            int ii = 0;
            for(int i=0;i<idarr.length;i++){
                String id = idarr[i];
                Loan loan = new Loan();
                loan.setId(id);
                loan.setAuditdate(new Date());
                loan.setAuditid(Userutils.getuserid(request,Userutils.CONSOLE_COOKIE_NAME));
                loan.setAuditman(Userutils.getusername(request,Userutils.CONSOLE_COOKIE_NAME));
                loan.setState(state);

                Repaydetail repaydetail = new Repaydetail();
                repaydetail.setLoanid(id);

                if("1".equals(state)){
                    loan.setAuditmsg("同意贷款");
                    repaydetail.setState(state);
                    ii += repaydetailMapper.updatestateByLoanIdSelective(repaydetail);
                }else{
                    loan.setAuditmsg(CommonUtil.isBlank(auditmsg)?"不同意贷款":auditmsg);
                    ii += repaydetailMapper.deleteByLoanid(id);
                }

                ii += loanMapper.updateByPrimaryKeySelective(loan);

            }
            result.put("code",1);
            result.put("message","已审核");
        }catch (Exception e){
            e.printStackTrace();
            result.put("code",0);
            result.put("message","系统错误，请联系管理员");
        }

        return result;
    }

}
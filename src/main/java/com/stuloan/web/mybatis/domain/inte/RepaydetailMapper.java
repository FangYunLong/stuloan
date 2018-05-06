package com.stuloan.web.mybatis.domain.inte;

import com.stuloan.web.mybatis.domain.Repaydetail;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public interface RepaydetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repaydetail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    int deleteByLoanid(String loanid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repaydetail
     *
     * @mbggenerated
     */
    int insert(Repaydetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repaydetail
     *
     * @mbggenerated
     */
    int insertSelective(Repaydetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repaydetail
     *
     * @mbggenerated
     */
    Repaydetail selectByPrimaryKey(String id);

    List<Repaydetail> selectByParams(Map<String,Object> params);

    List<Map<String,Object>> selectByParams01(Map<String,Object> params);

    Integer selectCountByParams(Map<String,Object> params);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repaydetail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Repaydetail record);

    int updatestateByLoanIdSelective(Repaydetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repaydetail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Repaydetail record);

    int updatesmsstate(String ids);
    int updatebyorderno(Map<String,String> repaydetail);
    List<Repaydetail> queryoverdue(Date date);
    int updateoverdue(Date date);
}
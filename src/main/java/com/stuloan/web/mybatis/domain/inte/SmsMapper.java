package com.stuloan.web.mybatis.domain.inte;

import com.stuloan.web.mybatis.domain.Sms;

public interface SmsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated
     */
    int insert(Sms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated
     */
    int insertSelective(Sms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated
     */
    Sms selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Sms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Sms record);
}
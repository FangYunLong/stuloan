package com.stuloan.web.mybatis.domain.inte;

import com.stuloan.web.mybatis.domain.Creditscore;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditscoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditscore
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditscore
     *
     * @mbggenerated
     */
    int insert(Creditscore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditscore
     *
     * @mbggenerated
     */
    int insertSelective(Creditscore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditscore
     *
     * @mbggenerated
     */
    Creditscore selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditscore
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Creditscore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditscore
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Creditscore record);
}
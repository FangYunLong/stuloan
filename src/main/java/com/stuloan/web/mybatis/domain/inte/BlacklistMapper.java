package com.stuloan.web.mybatis.domain.inte;

import com.stuloan.web.mybatis.domain.Blacklist;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BlacklistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklist
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklist
     *
     * @mbggenerated
     */
    int insert(Blacklist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklist
     *
     * @mbggenerated
     */
    int insertSelective(Blacklist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklist
     *
     * @mbggenerated
     */
    Blacklist selectByPrimaryKey(String id);

    List<Map<String,Object>> selectByparams(Map<String,Object> params);
    int selectCountByParams(Map<String,Object> params);
    List<Map<String,Object>> selectoverduedetail(Map<String,Object> params);
    int selectCountByParams4detail(Map<String,Object> params);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklist
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Blacklist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklist
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Blacklist record);
}
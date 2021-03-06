package com.stuloan.web.mybatis.domain;

import java.util.Date;

public class Repaydetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repaydetail.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repaydetail.loanid
     *
     * @mbggenerated
     */
    private String loanid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repaydetail.stagenum
     *
     * @mbggenerated
     */
    private Integer stagenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repaydetail.repaymoney
     *
     * @mbggenerated
     */
    private Double repaymoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repaydetail.repaydateplan
     *
     * @mbggenerated
     */
    private Date repaydateplan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repaydetail.repaydatereal
     *
     * @mbggenerated
     */
    private Date repaydatereal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repaydetail.isrepay
     *
     * @mbggenerated
     */
    private String isrepay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repaydetail.issendmsg
     *
     * @mbggenerated
     */
    private String issendmsg;

    private String state;

    private String isoverdue;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repaydetail.remark
     *
     * @mbggenerated
     */
    private String remark;

    private String orderno;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repaydetail
     *
     * @mbggenerated
     */
    public Repaydetail(String id, String loanid, Integer stagenum, Double repaymoney, Date repaydateplan
            , Date repaydatereal, String isrepay, String issendmsg, String state, String isoverdue
            , String remark, String orderno) {
        this.id = id;
        this.loanid = loanid;
        this.stagenum = stagenum;
        this.repaymoney = repaymoney;
        this.repaydateplan = repaydateplan;
        this.repaydatereal = repaydatereal;
        this.isrepay = isrepay;
        this.issendmsg = issendmsg;
        this.state = state;
        this.isoverdue = isoverdue;
        this.remark = remark;
        this.orderno = orderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repaydetail
     *
     * @mbggenerated
     */
    public Repaydetail() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repaydetail.id
     *
     * @return the value of repaydetail.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repaydetail.id
     *
     * @param id the value for repaydetail.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repaydetail.loanid
     *
     * @return the value of repaydetail.loanid
     *
     * @mbggenerated
     */
    public String getLoanid() {
        return loanid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repaydetail.loanid
     *
     * @param loanid the value for repaydetail.loanid
     *
     * @mbggenerated
     */
    public void setLoanid(String loanid) {
        this.loanid = loanid == null ? null : loanid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repaydetail.stagenum
     *
     * @return the value of repaydetail.stagenum
     *
     * @mbggenerated
     */
    public Integer getStagenum() {
        return stagenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repaydetail.stagenum
     *
     * @param stagenum the value for repaydetail.stagenum
     *
     * @mbggenerated
     */
    public void setStagenum(Integer stagenum) {
        this.stagenum = stagenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repaydetail.repaymoney
     *
     * @return the value of repaydetail.repaymoney
     *
     * @mbggenerated
     */
    public Double getRepaymoney() {
        return repaymoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repaydetail.repaymoney
     *
     * @param repaymoney the value for repaydetail.repaymoney
     *
     * @mbggenerated
     */
    public void setRepaymoney(Double repaymoney) {
        this.repaymoney = repaymoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repaydetail.repaydateplan
     *
     * @return the value of repaydetail.repaydateplan
     *
     * @mbggenerated
     */
    public Date getRepaydateplan() {
        return repaydateplan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repaydetail.repaydateplan
     *
     * @param repaydateplan the value for repaydetail.repaydateplan
     *
     * @mbggenerated
     */
    public void setRepaydateplan(Date repaydateplan) {
        this.repaydateplan = repaydateplan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repaydetail.repaydatereal
     *
     * @return the value of repaydetail.repaydatereal
     *
     * @mbggenerated
     */
    public Date getRepaydatereal() {
        return repaydatereal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repaydetail.repaydatereal
     *
     * @param repaydatereal the value for repaydetail.repaydatereal
     *
     * @mbggenerated
     */
    public void setRepaydatereal(Date repaydatereal) {
        this.repaydatereal = repaydatereal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repaydetail.isrepay
     *
     * @return the value of repaydetail.isrepay
     *
     * @mbggenerated
     */
    public String getIsrepay() {
        return isrepay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repaydetail.isrepay
     *
     * @param isrepay the value for repaydetail.isrepay
     *
     * @mbggenerated
     */
    public void setIsrepay(String isrepay) {
        this.isrepay = isrepay == null ? null : isrepay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repaydetail.issendmsg
     *
     * @return the value of repaydetail.issendmsg
     *
     * @mbggenerated
     */
    public String getIssendmsg() {
        return issendmsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repaydetail.issendmsg
     *
     * @param issendmsg the value for repaydetail.issendmsg
     *
     * @mbggenerated
     */
    public void setIssendmsg(String issendmsg) {
        this.issendmsg = issendmsg == null ? null : issendmsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repaydetail.remark
     *
     * @return the value of repaydetail.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repaydetail.remark
     *
     * @param remark the value for repaydetail.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getIsoverdue() {
        return isoverdue;
    }

    public void setIsoverdue(String isoverdue) {
        this.isoverdue = isoverdue;
    }
}
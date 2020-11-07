package com.cmall.demo.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PmsFeightTemplate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.id
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.name
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.charge_type
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private Integer chargeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.first_weight
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private BigDecimal firstWeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.first_fee
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private BigDecimal firstFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.continue_weight
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private BigDecimal continueWeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.continme_fee
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private BigDecimal continmeFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.dest
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private String dest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_feight_template
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.id
     *
     * @return the value of pms_feight_template.id
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.id
     *
     * @param id the value for pms_feight_template.id
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.name
     *
     * @return the value of pms_feight_template.name
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.name
     *
     * @param name the value for pms_feight_template.name
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.charge_type
     *
     * @return the value of pms_feight_template.charge_type
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public Integer getChargeType() {
        return chargeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.charge_type
     *
     * @param chargeType the value for pms_feight_template.charge_type
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.first_weight
     *
     * @return the value of pms_feight_template.first_weight
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.first_weight
     *
     * @param firstWeight the value for pms_feight_template.first_weight
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.first_fee
     *
     * @return the value of pms_feight_template.first_fee
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public BigDecimal getFirstFee() {
        return firstFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.first_fee
     *
     * @param firstFee the value for pms_feight_template.first_fee
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.continue_weight
     *
     * @return the value of pms_feight_template.continue_weight
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.continue_weight
     *
     * @param continueWeight the value for pms_feight_template.continue_weight
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.continme_fee
     *
     * @return the value of pms_feight_template.continme_fee
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public BigDecimal getContinmeFee() {
        return continmeFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.continme_fee
     *
     * @param continmeFee the value for pms_feight_template.continme_fee
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setContinmeFee(BigDecimal continmeFee) {
        this.continmeFee = continmeFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.dest
     *
     * @return the value of pms_feight_template.dest
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public String getDest() {
        return dest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.dest
     *
     * @param dest the value for pms_feight_template.dest
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setDest(String dest) {
        this.dest = dest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", chargeType=").append(chargeType);
        sb.append(", firstWeight=").append(firstWeight);
        sb.append(", firstFee=").append(firstFee);
        sb.append(", continueWeight=").append(continueWeight);
        sb.append(", continmeFee=").append(continmeFee);
        sb.append(", dest=").append(dest);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
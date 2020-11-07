package com.cmall.demo.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsProductOperateLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.id
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.product_id
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.price_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private BigDecimal priceOld;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.price_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private BigDecimal priceNew;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.sale_price_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private BigDecimal salePriceOld;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.sale_price_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private BigDecimal salePriceNew;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.gift_point_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private Integer giftPointOld;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.gift_point_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private Integer giftPointNew;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.use_point_limit_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private Integer usePointLimitOld;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.use_point_limit_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private Integer usePointLimitNew;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.operate_man
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private String operateMan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.create_time
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_product_operate_log
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.id
     *
     * @return the value of pms_product_operate_log.id
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.id
     *
     * @param id the value for pms_product_operate_log.id
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.product_id
     *
     * @return the value of pms_product_operate_log.product_id
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.product_id
     *
     * @param productId the value for pms_product_operate_log.product_id
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.price_old
     *
     * @return the value of pms_product_operate_log.price_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public BigDecimal getPriceOld() {
        return priceOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.price_old
     *
     * @param priceOld the value for pms_product_operate_log.price_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.price_new
     *
     * @return the value of pms_product_operate_log.price_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public BigDecimal getPriceNew() {
        return priceNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.price_new
     *
     * @param priceNew the value for pms_product_operate_log.price_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.sale_price_old
     *
     * @return the value of pms_product_operate_log.sale_price_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.sale_price_old
     *
     * @param salePriceOld the value for pms_product_operate_log.sale_price_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.sale_price_new
     *
     * @return the value of pms_product_operate_log.sale_price_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.sale_price_new
     *
     * @param salePriceNew the value for pms_product_operate_log.sale_price_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.gift_point_old
     *
     * @return the value of pms_product_operate_log.gift_point_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public Integer getGiftPointOld() {
        return giftPointOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.gift_point_old
     *
     * @param giftPointOld the value for pms_product_operate_log.gift_point_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setGiftPointOld(Integer giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.gift_point_new
     *
     * @return the value of pms_product_operate_log.gift_point_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public Integer getGiftPointNew() {
        return giftPointNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.gift_point_new
     *
     * @param giftPointNew the value for pms_product_operate_log.gift_point_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setGiftPointNew(Integer giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.use_point_limit_old
     *
     * @return the value of pms_product_operate_log.use_point_limit_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public Integer getUsePointLimitOld() {
        return usePointLimitOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.use_point_limit_old
     *
     * @param usePointLimitOld the value for pms_product_operate_log.use_point_limit_old
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setUsePointLimitOld(Integer usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.use_point_limit_new
     *
     * @return the value of pms_product_operate_log.use_point_limit_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public Integer getUsePointLimitNew() {
        return usePointLimitNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.use_point_limit_new
     *
     * @param usePointLimitNew the value for pms_product_operate_log.use_point_limit_new
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setUsePointLimitNew(Integer usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.operate_man
     *
     * @return the value of pms_product_operate_log.operate_man
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.operate_man
     *
     * @param operateMan the value for pms_product_operate_log.operate_man
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.create_time
     *
     * @return the value of pms_product_operate_log.create_time
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.create_time
     *
     * @param createTime the value for pms_product_operate_log.create_time
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_operate_log
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
        sb.append(", productId=").append(productId);
        sb.append(", priceOld=").append(priceOld);
        sb.append(", priceNew=").append(priceNew);
        sb.append(", salePriceOld=").append(salePriceOld);
        sb.append(", salePriceNew=").append(salePriceNew);
        sb.append(", giftPointOld=").append(giftPointOld);
        sb.append(", giftPointNew=").append(giftPointNew);
        sb.append(", usePointLimitOld=").append(usePointLimitOld);
        sb.append(", usePointLimitNew=").append(usePointLimitNew);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
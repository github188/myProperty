package com.jieshun.jslifesupporter.entity;

/**
 * @TODO 车牌支付订单实体类
 * @author jsst
 *
 */
public class VehiclePayOrder {

	private String orderType;
	private String bussinesserCode;
	private String bussinesserId;
	private String serviceFee;//应缴金额，单位元
	private String deducFee;//减扣金额，单元元
	private String discountFee;//优惠金额
	private String totalFee;//实缴金额
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getBussinesserCode() {
		return bussinesserCode;
	}
	public void setBussinesserCode(String bussinesserCode) {
		this.bussinesserCode = bussinesserCode;
	}
	public String getBussinesserId() {
		return bussinesserId;
	}
	public void setBussinesserId(String bussinesserId) {
		this.bussinesserId = bussinesserId;
	}
	public String getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
	public String getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}
	public String getDeducFee() {
		return deducFee;
	}
	public void setDeducFee(String deducFee) {
		this.deducFee = deducFee;
	}
	public String getDiscountFee() {
		return discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}
	
	
}

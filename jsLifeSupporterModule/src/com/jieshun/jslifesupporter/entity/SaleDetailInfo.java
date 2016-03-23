package com.jieshun.jslifesupporter.entity;

import java.io.Serializable;

import common.IItemBean;

/**
 * 打折明细实体类
 * @author 张辉
 *
 */
public class SaleDetailInfo implements Serializable , IItemBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9058164432710154470L;
	
	private String id;
	
	//打折记录id
	private String saleId;
	//操作员
	private String userId;
	//订单Id
	private String orderId;
	//方案Id
	private String planId;
	//门店Id
	private String businesserId;
	//方案名称
	private String planName;
	//门店名称
	private String storeName;
	//卡号/车牌号
	private String vehicleNo;
	//打折时间
	private String createTime;
	//同步状态 0：未同步  1：同步
	private int status;
	//优惠方式 0:优惠金额  1：优惠时间  2：全免
	private int module;
	//优惠数额
	private double amount;
	//操作员
	private String operatorName;
	//使用状态
	private String userStatus;
	
	
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSaleId() {
		return saleId;
	}
	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getBusinesserId() {
		return businesserId;
	}
	public void setBusinesserId(String businesserId) {
		this.businesserId = businesserId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getModule() {
		return module;
	}
	public void setModule(int module) {
		this.module = module;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	@Override
	public String getViewProviderClass(int id) {
		return "DiscountListViewProvider";
	}
	
	
}

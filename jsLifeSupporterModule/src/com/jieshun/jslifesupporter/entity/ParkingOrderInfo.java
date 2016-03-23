package com.jieshun.jslifesupporter.entity;

import java.io.Serializable;


public class ParkingOrderInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4577048507475086249L;
	
	// 商户号  由partner改为
		private String businesserCode;
		// 商户名称
		private String businesserName;
		// 商品ID
		private String merGID;
		//停车场Id
		private  String parkId;
		// 系统唯一的停车场标识
		private String parkingCode;
		// 停车场名称
		private String parkingName;
		// 停车卡号
		private String cardNo;
		// 车牌号码
		private String carNo;
		// 入场时间
		private String startTime;
		// 停车时长
		private String serviceTime;
		// 计费时间
		private String createTime;
		// 离场时间
		private String endTime;
		// 应缴金额
		private String serviceFee;
		// 减扣金额
		private String deductFee;
		// 优惠金额
		private String  discountFee;
		// 物流费用
		private String transportFee;
		// 其他费用
		private String otherFee;
		// 订单金额
		private String totalFee;
		// 订单状态 0:交易成功 1：支付失败 -1：待支付  100：支付成功 300：退款 500：关闭 600：无效
		private String tradeStatus;
		// 支付类型，现已不使用，改为使用payConfigList
		private String bankType; 
		// 附加数据
		private String attach;
		// //////////消费查询相关/////////////
		// 订单类型
		private String orderType;
		// 订单信息
		private String orderMsg;
		// 订单支付时间
		private String orderPayDate;
		// 离场提示（时间分钟）
		private int goParkDesc;
		// 发票时间
		private String ticketTime;
		// 发票地点
		private String ticketPlace;
		
		//商品Id
		private String gcodeId;
		
		//商品名称
		private String goodName;
		
//		//交易状态，-1 未支付 0支付成功  1支付失败    交易列表
//		private String status;
		//银行订单号
		private String bankBillNo;
		//支付币种
		private String feeType;

		//服务器接受通知url
		private String notifyUrl;
			
		//支付结果通知id
		private String notifyId;
		//交易类型
		private String tradeMode;
		
		//交易信息
		private String payInfo;
		//商户支持的支付类型
		private String payType;
		
		//停车卡号
		private String parkingCardNo;
		//订单编号
		private String orderNo;
		
		private int retCode;
		
		//交易备注信息
		private String remark;


		public String getParkId() {
			return parkId;
		}

		public void setParkId(String parkId) {
			this.parkId = parkId;
		}

		public int getRetCode() {
			return retCode;
		}



		public void setRetCode(int retCode) {
			this.retCode = retCode;
		}



		public String getBusinesserName() {
			return businesserName;
		}



		public void setBusinesserName(String businesserName) {
			this.businesserName = businesserName;
		}

		public String getGcodeId() {
			return gcodeId;
		}



		public void setGcodeId(String gcodeId) {
			this.gcodeId = gcodeId;
		}



		public String getOrderNo() {
			return orderNo;
		}
		


		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}



//		public String getOutTradeNo() {
//			return outTradeNo;
//		}
	//
	//
	//
//		public void setOutTradeNo(String outTradeNo) {
//			this.outTradeNo = outTradeNo;
//		}






		public String getBusinesserCode() {
			return businesserCode;
		}



		public void setBusinesserCode(String businesserCode) {
			this.businesserCode = businesserCode;
		}



		public String getGoodName() {
			return goodName;
		}



		public void setGoodName(String goodName) {
			this.goodName = goodName;
		}



		public String getMerGID() {
			return merGID;
		}



		public void setMerGID(String merGID) {
			this.merGID = merGID;
		}






		public String getParkingCode() {
			return parkingCode;
		}



		public void setParkingCode(String parkingCode) {
			this.parkingCode = parkingCode;
		}



		public String getParkingName() {
			return parkingName;
		}



		public void setParkingName(String parkingName) {
			this.parkingName = parkingName;
		}



		public String getCardNo() {
			return cardNo;
		}



		public void setCardNo(String cardNo) {
			this.cardNo = cardNo;
		}



		public String getCarNo() {
			return carNo;
		}



		public void setCarNo(String carNo) {
			this.carNo = carNo;
		}



		public String getStartTime() {
			return startTime;
		}



		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}



		public String getServiceTime() {
			return serviceTime;
		}



		public void setServiceTime(String serviceTime) {
			this.serviceTime = serviceTime;
		}



		public String getCreateTime() {
			return createTime;
		}



		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}



		public String getEndTime() {
			return endTime;
		}



		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}



		public String getServiceFee() {
			return serviceFee;
		}



		public void setServiceFee(String serviceFee) {
			this.serviceFee = serviceFee;
		}



		public String getDeductFee() {
			return deductFee;
		}



		public void setDeductFee(String deductFee) {
			this.deductFee = deductFee;
		}



		public String getDiscountFee() {
			return discountFee;
		}



		public void setDiscountFee(String discountFee) {
			this.discountFee = discountFee;
		}



		public String getTransportFee() {
			return transportFee;
		}



		public void setTransportFee(String transportFee) {
			this.transportFee = transportFee;
		}



		public String getOtherFee() {
			return otherFee;
		}



		public void setOtherFee(String otherFee) {
			this.otherFee = otherFee;
		}



		public String getTotalFee() {
			return totalFee;
		}



		public void setTotalFee(String totalFee) {
			this.totalFee = totalFee;
		}



		


		public String getTradeStatus() {
			return tradeStatus;
		}



		public void setTradeStatus(String tradeStatus) {
			this.tradeStatus = tradeStatus;
		}



		public String getBankType() {
			return bankType;
		}



		public void setBankType(String bankType) {
			this.bankType = bankType;
		}



		public String getAttach() {
			return attach;
		}



		public void setAttach(String attach) {
			this.attach = attach;
		}



		public String getOrderType() {
			return orderType;
		}



		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}



		public String getOrderMsg() {
			return orderMsg;
		}



		public void setOrderMsg(String orderMsg) {
			this.orderMsg = orderMsg;
		}



		public String getOrderPayDate() {
			return orderPayDate;
		}



		public void setOrderPayDate(String orderPayDate) {
			this.orderPayDate = orderPayDate;
		}



		


		public int getGoParkDesc() {
			return goParkDesc;
		}



		public void setGoParkDesc(int goParkDesc) {
			this.goParkDesc = goParkDesc;
		}



		public String getTicketTime() {
			return ticketTime;
		}



		public void setTicketTime(String ticketTime) {
			this.ticketTime = ticketTime;
		}



		public String getTicketPlace() {
			return ticketPlace;
		}



		public void setTicketPlace(String ticketPlace) {
			this.ticketPlace = ticketPlace;
		}






//		public String getStatus() {
//			return status;
//		}
	//
	//
	//
//		public void setStatus(String status) {
//			this.status = status;
//		}



		public String getBankBillNo() {
			return bankBillNo;
		}



		public void setBankBillNo(String bankBillNo) {
			this.bankBillNo = bankBillNo;
		}



		public String getFeeType() {
			return feeType;
		}



		public void setFeeType(String feeType) {
			this.feeType = feeType;
		}



		public String getNotifyUrl() {
			return notifyUrl;
		}



		public void setNotifyUrl(String notifyUrl) {
			this.notifyUrl = notifyUrl;
		}



		public String getNotifyId() {
			return notifyId;
		}



		public void setNotifyId(String notifyId) {
			this.notifyId = notifyId;
		}



		public String getTradeMode() {
			return tradeMode;
		}



		public void setTradeMode(String tradeMode) {
			this.tradeMode = tradeMode;
		}



		public String getPayInfo() {
			return payInfo;
		}



		public void setPayInfo(String payInfo) {
			this.payInfo = payInfo;
		}



		public String getPayType() {
			return payType;
		}



		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getParkingCardNo() {
			return parkingCardNo;
		}

		public void setParkingCardNo(String parkingCardNo) {
			this.parkingCardNo = parkingCardNo;
		}

		public String getRemark()
		{
			return remark;
		}

		public void setRemark(String remark)
		{
			this.remark = remark;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

}

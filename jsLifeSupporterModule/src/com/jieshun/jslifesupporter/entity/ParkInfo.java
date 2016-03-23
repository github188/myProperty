package com.jieshun.jslifesupporter.entity;

import java.io.Serializable;

/**
 * 停车场信息实体类
 * @author 张辉
 *
 */
public class ParkInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6911203000749424346L;
	//停车场Id
	private String parkId;
	//停车场编号
	private String parkCode;
	//停车场名称
	private String parkName;
	//商户Id
	private String businesserId;
	//商户名称
	private String businesserName;
	//商户标号
	private String businesserCode;
	//小区Id
	private String areaId;
	
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getParkId() {
		return parkId;
	}
	public void setParkId(String parkId) {
		this.parkId = parkId;
	}
	public String getParkCode() {
		return parkCode;
	}
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public String getBusinesserId() {
		return businesserId;
	}
	public void setBusinesserId(String businesserId) {
		this.businesserId = businesserId;
	}
	public String getBusinesserName() {
		return businesserName;
	}
	public void setBusinesserName(String businesserName) {
		this.businesserName = businesserName;
	}
	public String getBusinesserCode() {
		return businesserCode;
	}
	public void setBusinesserCode(String businesserCode) {
		this.businesserCode = businesserCode;
	}
	
	
	
}

/*
 * 文件名：VersionInfo.java
 * 创建日期：2014-06-05
 * 产品名称：捷顺捷生活APP软件
 * 版权所有：深圳市捷顺科技股份有限责任公司
 * 该文件隶属于公司该产品下的内部有价值的私密文件，仅供内部研发使用，不得私自拷贝、抄录
 * 
 */
package com.jieshun.jslifesupporter.entity;

import java.io.Serializable;
import java.util.Date;

import org.litepal.crud.DataSupport;

import common.IItemBean;

/**
 * @ClassName VersionInfo
 * @Description 版本信息实体类
 * @author 张辉
 * @date 2015年06月15日    14:50:00
 *
 */
public class VersionInfo  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -891825684083934400L;
	// 版本号
	private String versionNo;
	// 下载地址
	private String downloadUrl;
	// 版本信息
	private String verionInfo;
	// 更新时间
	private Date updateTime;
	// 机型
	private String mobileModels;
	// 系统版本
	private String systemType;
	//版本大小
	private int verSize;
	//版本简称
	private String name;
	//设备类型
	private String versionType;
	
	public String getVersionType() {
		return versionType;
	}

	public void setVersionType(String versionType) {
		this.versionType = versionType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getVerSize() {
		return verSize;
	}

	public void setVerSize(int verSize) {
		this.verSize = verSize;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getVerionInfo() {
		return verionInfo;
	}

	public void setVerionInfo(String verionInfo) {
		this.verionInfo = verionInfo;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getMobileModels() {
		return mobileModels;
	}

	public void setMobileModels(String mobileModels) {
		this.mobileModels = mobileModels;
	}

	public String getSystemType() {
		return systemType;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

}

package com.jieshun.jslifesupporter.entity;

import java.io.Serializable;
import java.util.List;

import org.litepal.crud.DataSupport;

import common.IItemBean;

/**
 * 
 ************************************************** 
 * @ClassName: RepairReportInfo
 * @Description: TODO(服务信息 可用于投诉、报修)
 * @author 黄俊鑫
 * @date 2014年10月29日 下午7:43:04
 * 
 *************************************************** 
 */
public class ServiceInfo extends DataSupport implements Serializable, IItemBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5877825362530709008L;
	private String serviceId;
	private String serviceTitle;
	private String serviceContent;
	private String serviceDetail;
	private String publishTime;
	private String publisherId;
	private String publisherName;
	private String picName;
	private String picSize;
	private String serviceClass;
	private String serviceType;
	//服务状态
	private String status;
	private String remark;
	private String recordCount;
	//单张服务图片，给列表用
	private String servicePicUrl;
	
	private List<ServicePic> servicePicList;
	

	

	public List<ServicePic> getServicePicList() {
		return servicePicList;
	}

	public void setServicePicList(List<ServicePic> servicePicList) {
		this.servicePicList = servicePicList;
	}

	public String getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(String recordCount) {
		this.recordCount = recordCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceTitle() {
		return serviceTitle;
	}

	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}

	public String getServiceContent() {
		return serviceContent;
	}

	public void setServiceContent(String serviceContent) {
		this.serviceContent = serviceContent;
	}

	public String getServiceDetail() {
		return serviceDetail;
	}

	public void setServiceDetail(String serviceDetail) {
		this.serviceDetail = serviceDetail;
	}

	
	

	public String getServicePicUrl() {
		return servicePicUrl;
	}

	public void setServicePicUrl(String servicePicUrl) {
		this.servicePicUrl = servicePicUrl;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public String getPicSize() {
		return picSize;
	}

	public void setPicSize(String picSize) {
		this.picSize = picSize;
	}

	public String getServiceClass() {
		return serviceClass;
	}

	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String getViewProviderClass(int id) {
		return "MyRepairInfoViewProvider";
	}

}

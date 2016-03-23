/*
 * 文件名：PictureInfo.java
 * 创建日期：2014-06-04
 * 产品名称：捷顺捷生活APP软件
 * 版权所有：深圳市捷顺科技股份有限责任公司
 * 该文件隶属于公司该产品下的内部有价值的私密文件，仅供内部研发使用，不得私自拷贝、抄录
 * 
 */
package com.jieshun.jslifesupporter.entity;

import java.io.Serializable;

/************************************************
 * 图片信息实体
 * 
 * @author:黄俊鑫
 * @version: 1.0
 * @description:图片信息实体
 *************************************************/
public class PictureInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2676496531153110800L;
	// 图片ID
	private String picId;
	// 链接标题
	private String title;
	// 图片名称
	private String picName;
	// 图片下载地址
	private String picDownloadUrl;
	// 图片链接地址
	private String activeUrl;
	// 图片更新时间
	private String picUpdateTime;
	// 图片类型
	private String category;
	// 是否更变
	private String isModify;

	/*
	 * 重写equals方法
	 */
	public boolean equals(Object other) {

		if (this == other) // 先检查是否其自反性，后比较other是否为空。这样效率高
			return true;
		if (other == null)
			return false;
		if (!(other instanceof PictureInfo))
			return false;
		final PictureInfo picture = (PictureInfo) other;
		if (!getPicId().equals(picture.getPicId()))
			return false;
		return true;
	}

	/*
	 * 重写hashCode方法
	 */
	public int hashCode() { // hashCode主要是用来提高hash系统的查询效率。当hashCode中不进行任何操作时，可以直接让其返回
							// 一常数，或者不进行重写。
		int result = getPicId().hashCode();
		return result;
	}

	public String getIsModify() {
		return isModify;
	}

	public void setIsModify(String isModify) {
		this.isModify = isModify;
	}

	public String getPicId() {
		return picId;
	}

	public void setPicId(String picId) {
		this.picId = picId;
	}
	

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicDownloadUrl() {
		return picDownloadUrl;
	}

	public void setPicDownloadUrl(String picDownloadUrl) {
		this.picDownloadUrl = picDownloadUrl;
	}

	public String getActiveUrl() {
		return activeUrl;
	}

	public void setActiveUrl(String activeUrl) {
		this.activeUrl = activeUrl;
	}

	public String getPicUpdateTime() {
		return picUpdateTime;
	}

	public void setPicUpdateTime(String picUpdateTime) {
		this.picUpdateTime = picUpdateTime;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}

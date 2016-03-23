package com.jieshun.jslifesupporter.entity;

import java.io.Serializable;

import org.litepal.crud.DataSupport;

import common.IItemBean;

/**
 * @ClassName User
 * @Description 用户实体类
 * @author 张辉
 * @date 2015年06月15日    14:50:00
 *
 */
public class User extends DataSupport implements Serializable, IItemBean {


	/**
	 * 
	 */
	private static final long serialVersionUID = -6931910522714432554L;
	private int id;
	//姓名
	private String name;
	//用户名(手机号)
	private String userName;
	//用户类型
	private String userType;
	//密码
	private String userPassword;
	//用户ID
	private String userId;
	//昵称
	private String nickName;
	//是否已登录
	private Boolean isLogin;
	//登录服务地址
	private String loginServer;
	//用户状态
	private String status;
	//本地头像路径
	private String localAvatarPath;
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}



	public String getUserPassword() {
		return userPassword;
	}



	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getNickName() {
		return nickName;
	}



	public void setNickName(String nickName) {
		this.nickName = nickName;
	}



	public Boolean isLogin() {
		return isLogin;
	}



	public void setLogin(Boolean isLogin) {
		this.isLogin = isLogin;
	}



	public String getLoginServer() {
		return loginServer;
	}



	public void setLoginServer(String loginServer) {
		this.loginServer = loginServer;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Boolean getIsLogin() {
		return isLogin;
	}


	public void setIsLogin(Boolean isLogin) {
		this.isLogin = isLogin;
	}



	public String getLocalAvatarPath() {
		return localAvatarPath;
	}



	public void setLocalAvatarPath(String localAvatarPath) {
		this.localAvatarPath = localAvatarPath;
	}



	@Override
	public String getViewProviderClass(int id) {
		
		switch (id) {
		case 0:
			return "UserViewProvider";

		}
		return null;
	}

}

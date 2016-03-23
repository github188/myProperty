package com.jieshun.jslifesupporter.module;

public class ServiceID {

	/*********************** 用户管理 **********************************************/
	// 登录
	public static final String JSCSP_SYS_LOGIN = "JSCSP_SYS_LOGIN";

	// 获取个人配置信息
	public static final String JSCSP_USER_GETUSERCONFIGINFO = "JSCSP_USER_GETUSERCONFIGINFO";

	// 获取app配置信息
	public static final String JSCSP_VERSION_GETAPPCONFIGINFO = "JSCSP_VERSION_GETAPPCONFIGINFO";
	// 获取个人信息
	public static final String JSCSP_USER_GETUSERINFO = "JSCSP_USER_GETUSERINFO";
	// 设置个人信息
	public static final String JSCSP_USER_SETUSERINFO = "JSCSP_USER_SETUSERINFO";


	// 用户注册
	public static final String JSCSP_USER_REGUSERINFO = "JSCSP_USER_REGUSERINFO";
	// 重置用户密码
	public static final String JSCSP_USER_RESETUSERPASS = "JSCSP_USER_RESETUSERPASS";

	// 绑定手机
	public static final String JSCSP_USER_BINDCELL = "JSCSP_USER_BINDCELL";

	// 修改住户审批资料
	public static final String JSCSP_USER_UPDATEPERSON = "JSCSP_USER_UPDATEPERSON";

	// 获取验证码
	public static final String JSCSP_SYS_GETVERIFYCODE = "JSCSP_SYS_GETVERIFYCODE";

	/*********************** 基础资料管理 **********************************************/
	// 查询停车场
	public static final String JSCSP_BASE_QUERYPARK = "JSCSP_BASE_QUERYPARK";
	// 查询用户车辆信息
	public static final String JSCSP_BASE_QUERYVEHICLE = "JSCSP_BASE_QUERYVEHICLE";

	// 添加车辆信息
	public static final String JSCSP_BASE_ADDVEHICLE = "JSCSP_BASE_ADDVEHICLE";

	// 更新车辆信息
	public static final String JSCSP_BASE_UPDATEVEHICLE = "JSCSP_BASE_UPDATEVEHICLE";

	// 查询相似车辆信息
	public static final String JSCSP_BASE_SIMILARVEHICLE = "JSCSP_BASE_SIMILARVEHICLE";

	// 删除车辆信息
	public static final String JSCSP_BASE_DELVEHICLE = "JSCSP_BASE_DELVEHICLE";

	// 查询小区详细信息
	public static final String JSCSP_BASE_AREADETAIL = "JSCSP_BASE_AREADETAIL";

	// 开通社区服务
	public static final String JSCSP_BASE_APPLYCOMMUSERVICE = "JSCSP_BASE_APPLYCOMMUSERVICE";

	// 设置默认小区
	public static final String JSCSP_BASE_SETDEFAULTAREA = "JSCSP_BASE_SETDEFAULTAREA";

	// 查询商铺信息列表
	public static final String JSCSP_BASE_QUERYSTORE = "JSCSP_BASE_QUERYSTORE";

	// 支付参数查询(丢弃)
	//	public static final String JSCSP_BASE_QUERYPAYPARAM = "JSCSP_BASE_QUERYPAYPARAM";

	/*********************** APP管理 **********************************************/

	// 设置常用停车场
	public static final String JSCSP_APP_ADDUSERPARK = "JSCSP_APP_ADDUSERPARK";
	// 删除常用停车场
	public static final String JSCSP_APP_DELUSERPARK = "JSCSP_APP_DELUSERPARK";

	// 获取常用停车场
	public static final String JSCSP_APP_QUERYUSERPARK = "JSCSP_APP_QUERYUSERPARK";

	// 查询用户关联小区
	public static final String JSCSP_APP_MYCOMMUNITY = "JSCSP_APP_MYCOMMUNITY";

	// 添加我的邀请人
	public static final String JSCSP_APP_ADDMYINVITER = "JSCSP_APP_ADDMYINVITER";

	// 取消我的邀请人
	public static final String JSCSP_APP_DELMYINVITER = "JSCSP_APP_DELMYINVITER";

	// 查询我的邀请人列表
	public static final String JSCSP_APP_QUERYMYINVITER = "JSCSP_APP_QUERYMYINVITER";

	/*********************** 卡务管理 **********************************************/
	// 绑定捷顺通卡

	public static final String JSCSP_JST_BINDJSTCARD = "JSCSP_JST_BINDJSTCARD";

	// 设置默认的捷顺通卡
	public static final String JSCSP_JST_SETDEFAULTJSTCARD = "JSCSP_JST_SETDEFAULTJSTCARD";

	// 捷顺通卡余额查询
	public static final String JSCSP_JST_QUERYJSTCARDMONEY = "JSCSP_JST_QUERYJSTCARDMONEY";

	// 取消绑定捷顺通卡
	public static final String JSCSP_JST_UNBINDJSTCARD = "JSCSP_JST_UNBINDJSTCARD";

	// 查询捷顺通卡账户信息
	public static final String JSCSP_JST_QUERYJSTCARDS = "JSCSP_JST_QUERYJSTCARDS";

	// 捷顺通卡交易明细
	public static final String JSCSP_JST_DEALDETAIL = "JSCSP_JST_DEALDETAIL";

	// 查询用户卡状态
	public static final String JSCSP_CARD_QUERYCARDSTATUS = "JSCSP_CARD_QUERYCARDSTATUS";

	// 查询用户的开卡记录
	public static final String JSCSP_CARD_QUERYCARDAPPLYLIST = "JSCSP_CARD_QUERYCARDAPPLYLIST";

	// 查询车场卡套餐
	public static final String JSCSP_CARD_QUERYPARKCARDPACKAGE = "JSCSP_CARD_QUERYPARKCARDPACKAGE";

	// 用户申请开卡
	public static final String JSCSP_CARD_APPLYCARD = "JSCSP_CARD_APPLYCARD";

	// 取消申请开卡
	public static final String JSCSP_CARD_CANCEL_APPROVING_CARD = "JSCSP_CARD_CANCELAPPROVING";

	// 卡片挂失
	public static final String JSCSP_CARD_LOSSCARD = "JSCSP_CARD_LOSSCARD";

	/*********************** 微社区管理 **********************************************/

	// 查询水电煤

	public static final String JSCSP_CMNT_QUERYUTILITIES = "JSCSP_CMNT_QUERYUTILITIES";

	// 查询门禁设备列表
	public static final String JSCSP_CMNT_QUERYDOORDEVICELIST = "JSCSP_CMNT_QUERYDOORDEVICELIST";

	// 查询车场出入口设备列表
	public static final String JSCSP_CMNT_QUERYPARKDEVICELIST = "JSCSP_CMNT_QUERYPARKDEVICELIST";

	// 设置开门密码
	public static final String JSCSP_CMNT_SETOPENDOORPWD = "JSCSP_CMNT_SETOPENDOORPWD";

	// 手机开门
	public static final String JSCSP_CMNT_OPENDOOR = "JSCSP_CMNT_OPENDOOR";

	// 手机开闸
	public static final String JSCSP_CMNT_OPENPARK = "JSCSP_CMNT_OPENPARK";

	// 手机开门密码查询
	public static final String JSCSP_CMNT_QUERYOPENDOORPWD = "JSCSP_CMNT_QUERYOPENDOORPWD";

	// 修改手机开门密码
	public static final String JSCSP_CMNT_UPDATEOPENDOORPWD = "JSCSP_CMNT_UPDATEOPENDOORPWD";

	// 查询APP开门开闸记录
	public static final String JSCSP_CMNT_QUERYAPPOPENDEVICELOG = "JSCSP_CMNT_QUERYAPPOPENDEVICELOG";

	/*********************** 业务管理 **********************************************/

	// 扫码支付订单查询
	public static final String JSCSP_ORDER_SCANGENERATE = "JSCSP_ORDER_SCANGENERATE";
	// 车牌支付
	public static final String JSCSP_ORDER_CARNOGENERATE = "JSCSP_ORDER_CARNOGENERATE";

	// 查询商品详情
	public static final String JSCSP_ORDER_GOODSINFO = "JSCSP_ORDER_GOODSINFO";


	// 获取资讯列表
	public static final String JSCSP_INFO_QUERYINFOMATION = "JSCSP_INFO_QUERYINFOMATION";
	// 查询资讯详情
	public static final String JSCSP_INFO_GETINFOMATION = "JSCSP_INFO_GETINFOMATION";
	// 新增资讯详情
	public static final String JSCSP_INFO_ADDINFOMATION = "JSCSP_INFO_ADDINFOMATION";
	// 修改资讯信息（是否置顶）
	public static final String JSCSP_INFO_UPDATEINFOISTOP = "JSCSP_INFO_UPDATEINFOISTOP";
	// 资讯图片上传
	public static final String JSCSP_INFO_UPLOADPHOTO = "JSCSP_INFO_UPLOADPHOTO";
	// 删除资讯信息
	public static final String JSCSP_INFO_DELINFOMATION = "JSCSP_INFO_DELINFOMATION";
	// 删除资讯信息
	public static final String JSCSP_INFO_UPDATEPICSTATUS = "JSCSP_INFO_UPDATEPICSTATUS";

	// 更新快捷图标排序
	public static final String JSCSP_VERSION_UPDATESHORTCUT = "JSCSP_VERSION_UPDATESHORTCUT";
	// 查询快捷图标排序
	public static final String JSCSP_VERSION_GETSHORTCUT = "JSCSP_VERSION_GETSHORTCUT";

	// 录入反馈意见
	public static final String JSCSP_FEEDBACK_ADDCONTENT = "JSCSP_FEEDBACK_ADDCONTENT";

	// 录入反馈问题详情
	public static final String JSCSP_FEEDBACK_ADDCONTENTDETAIL = "JSCSP_FEEDBACK_ADDCONTENTDETAIL";
	// 查询反馈问题列表
	public static final String JSCSP_FEEDBACK_QUERYCONTENT = "JSCSP_FEEDBACK_QUERYCONTENT";

	// 删除反馈问题
	public static final String JSCSP_FEEDBACK_DELCONTENT = "JSCSP_FEEDBACK_DELCONTENT";

	// 查询反馈问题详情
	public static final String JSCSP_FEEDBACK_QUERYCONTENTDETAIL = "JSCSP_FEEDBACK_QUERYCONTENTDETAIL";
	// 获取请求服务列表
	public static final String JSCSP_REQSERVICE_QUERYREQSERVICE = "JSCSP_REQSERVICE_QUERYREQSERVICE";
	// 查询请求服务详情
	public static final String JSCSP_REQSERVICE_GETREQSERVICEDETAIL = "JSCSP_REQSERVICE_GETREQSERVICEDETAIL";
	// 删除请求服务信息
	public static final String JSCSP_REQSERVICE_DELREQSERVICE = "JSCSP_REQSERVICE_DELREQSERVICE";

	// 服务请求图片上传
	public static final String JSCSP_REQSERVICE_UPLOADPHOTO = "JSCSP_REQSERVICE_UPLOADPHOTO";
	//
	public static final String JSCSP_DISCOUNT_QUERYPOLICY = "JSCSP_DISCOUNT_QUERYPOLICY";
	/*********************** 数据管理 **********************************************/
	// 生成月卡缴费订单
	public static final String JSCSP_ORDER_DELAYGENERATE = "JSCSP_ORDER_DELAYGENERATE";
	//	 查询支付参数 （废弃）
	//	public static final String JSCSP_ORDER_GETPAYPARAM = "JSCSP_ORDER_GETPAYPARAM";
	// 用户版消费订单查询
	public static final String JSCSP_ORDER_USERVERSIONRECORDS = "JSCSP_ORDER_USERVERSIONRECORDS";
	// 领取发票
	public static final String JSCSP_ORDER_GETINVOICE = "JSCSP_ORDER_GETINVOICE";

	// 支付结果查询
	public static final String JSCSP_ORDER_PAYRESULT = "JSCSP_ORDER_PAYRESULT";
	// 消费订单详情查询
	public static final String JSCSP_ORDER_DETAILINFO = "JSCSP_ORDER_DETAILINFO";
	// 查询商品信息
	public static final String JSCSP_ORDER_GETGOODS = "JSCSP_ORDER_GETGOODS";
	// 查询优惠总数
	public static final String JSCSP_ORDER_DISCCOUNT = "JSCSP_ORDER_DISCCOUNT";
	// 打折记录查询
	public static final String JSCSP_ORDER_DISCRECORDS = "JSCSP_ORDER_DISCRECORDS";
	// 设置推送开关
	public static final String JSCSP_MSGPUSH_SETCONFIG = "JSCSP_MSGPUSH_SETCONFIG";
	// 获取推送设置
	public static final String JSCSP_MSGPUSH_QUERYCONFIG = "JSCSP_MSGPUSH_QUERYCONFIG";
	// 我的消息列表
	public static final String JSCSP_MSGPUSH_QUERYMSG = "JSCSP_MSGPUSH_QUERYMSG";
	// 生产商品支付订单
	public static final String JSCSP_ORDER_GOODGENERATE = "JSCSP_ORDER_GOODGENERATE";
	// 消息推送
	public static final String JSCSP_MSGPUSH_PUSH = "JSCSP_MSGPUSH_PUSH";
	// 支付参数查询（预支付）
	public static final String JSCSP_ORDER_PROCESSORDER = "JSCSP_ORDER_PROCESSORDER";






	/*********************** 自定义 **********************************************/
	// xmpp登录
	public static final String CUSTOM_XMPP_LOGIN = "CUSTOM_XMPP_LOGIN";
	// 修改openfire密码
	// public static final String CUSTOM_XMPP_MODIFY_PWD =
	// "CUSTOM_XMPP_MODIFY_PWD";
	/*********************** 商户打折 **********************************************/
	//打折方案
	public static final String JSCSP_ORDER_SALEPLAN="ac.saleplan.sy_getstorequerysaleplan";
	//执行打折
	public static final String JSCSP_ORDER_EXECUTE_SALE="ac.saleplan.sy_executesaleplan";
	// 新增请求服务信息
	public static final String JSCSP_REQSERVICE_ADDREQSERVICE = "JSCSP_REQSERVICE_ADDREQSERVICE";
	// 更新服务请求图片上传状态
	public static final String JSCSP_REQSERVICE_UPDATPICSTATUS = "JSCSP_REQSERVICE_UPDATPICSTATUS";
	// 最新版本信息
	public static final String JSCSP_VERSION_GETNEWVERSION = "JSCSP_VERSION_GETNEWVERSION";
	// 查询打折记录
	public static final String JSCSP_ORDER_QUERYSALEDETAILINFO = "ac.saleplan.sy_getuserquerysaleplaninfo";
	// 查询打折优惠总额
	public static final String JSCSP_ORDER_QUERYPRIVILEGETOTALINFO = "ac.saleplan.sy_getuserquerysaleplantotal";
	// 修改用户昵称
	public static final String JSCSP_USER_UPDATEUSERNICK = "JSCSP_USER_UPDATEUSERNICK";
	// 获取多媒体信息
	public static final String JSCSP_INFO_QUERYMEDIA = "JSCSP_INFO_QUERYMEDIA";
	// 获取停车场信息
	public static final String JSCSP_INFO_QUERYPARK = "ac.store.sy_getuserquerypark";
	// 修改用户密码
	public static final String JSCSP_USER_UPDATEUSERPASS = "JSCSP_USER_UPDATEUSERPASS";
}

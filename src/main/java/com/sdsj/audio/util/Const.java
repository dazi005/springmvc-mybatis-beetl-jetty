package com.sdsj.audio.util;

import org.springframework.context.ApplicationContext;
/**
 *  常量设置类
 * @author:phu
 * 2015-12-15
*/
public class Const {
	public static final String SESSION_SECURITY_CODE = "sessionSecCode";
	public static final String SESSION_USER = "sessionUser";
	public static final String SESSION_ROLE_RIGHTS = "sessionRoleRights";
	public static final String SEPARATOR=",sd,";                        //统一分隔符
	public static final String SESSION_menuList = "menuList";			//当前菜单
	public static final String SESSION_allmenuList = "allmenuList";		//全部菜单
	public static final String SESSION_userpds = "userpds";			
	public static final String SESSION_USERROL = "USERROL";				//用户对象
	public static final String SESSION_USERNAME = "USERNAME";			//用户名
	public static final String TRUE = "T";
	public static final String FALSE = "F";
	public static final String SYSNAME = "config/SYSNAME.txt";	//系统名称路径
	public static final String EMAIL = "config/EMAIL.txt";		//邮箱服务器配置路径
	public static final String SMS1 = "config/SMS1.txt";			//短信账户配置路径1
	public static final String FWATERM = "config/FWATERM.txt";	//文字水印配置路径
	public static final String IWATERM = "config/IWATERM.txt";	//图片水印配置路径
	public static final String FILEPATHIMG = "webapp/images/demo/";	//图片上传路径
	public static final String FILEPATHFILE = "uploadFiles/";		//文件上传路径
	public static final String FILEPATHTWODIMENSIONCODE = "uploadFiles/twoDimensionCode/"; //二维码存放路径
	public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(logout)|(code)|(app)|(weixin)|(static)|(main)|(websocket)).*";	//不对匹配该值的访问路径拦截（正则）
	
	
	public static ApplicationContext WEB_APP_CONTEXT = null; //该值会在web容器启动时由WebAppContextListener初始化
	
	/**
	 * APP Constants
	 */
	//根据项目立案编号及部门编号获取当前步骤及属性接口_请求协议中的参数
	public static final String[] APP_GETPROJECTSTEP_PARAM_ARRAY = new String[]{"ID","depID"};
	public static final String[] APP_GETPROJECTSTEP_VALUE_ARRAY = new String[]{"工程编号","部门编号"};
	
	//根据项目立案编号获取阶段一表制信息
	public static final String[] APP_GETPROJECTFORM_PARAM_ARRAY = new String[]{"ID"};
	public static final String[] APP_GETPROJECTFORM_VALUE_ARRAY = new String[]{"立案编号"};
	
	//获取材料的信息
	public static final String[] APP_GETRESOURCEOBJECTINFO_PARAM_ARRAY = new String[]{"InstanceID","ResourceType","deptCode"};
	public static final String[] APP_GETRESOURCEOBJECTINFO_VALUE_ARRAY = new String[]{"项目立案编号","要查看的材料类型","部门编号"};

	//获取所有材料的信息
	public static final String[] APP_GETALLRESOURCEOBJECTINFO_PARAM_ARRAY = new String[]{"projectID","deptCode"};
	public static final String[] APP_GETALLRESOURCEOBJECTINFO_VALUE_ARRAY = new String[]{"项目立案编号","部门编号"};
	
	//更新业务办理状态
	public static final String[] APP_UPDATEFLOWSTATE_PARAM_ARRAY = new String[]{"ID","depID","ItemCode","state","opinionDetail","opinionResult"};
	public static final String[] APP_UPDATEFLOWSTATE_VALUE_ARRAY = new String[]{"工程编号","部门编号","事项编码","状态","办理意见","办理结果"};
	
	//提交办理结果材料
	public static final String[] APP_UPDATEFLOWRESULT_PARAM_ARRAY = new String[]{"ID","depID","resourceID","ZJHPWBH","ZJHPWMC","ZJHPWYXQX","downURL"};
	public static final String[] APP_UPDATEFLOWRESULT_VALUE_ARRAY = new String[]{"工程编号","部门编号","办理结果编号","证件/批文的编号","证件/批文的名称","证件/批文有效期限","结果材料下载地址"};
   
	//根据项目立案编号及部门编号获取所有部门办理意见
	public static final String[] APP_GETDFOPINION_PARAM_ARRAY = new String[]{"InstanceID"};
	public static final String[] APP_GETDFOPINION_VALUE_ARRAY = new String[]{"工程编号"};
	
	//消息通知接口一
	public static final String[] APP_SENDITEMNOTICE1_PARAM_ARRAY = new String[]{"ID","NumberType"};
	public static final String[] APP_SENDITEMNOTICE1_VALUE_ARRAY = new String[]{"编号","消息类型"};
	
	//消息通知接口二
	public static final String[] APP_SENDITEMNOTICE2_PARAM_ARRAY = new String[]{"ID","DeptID","NumberType"};
	public static final String[] APP_SENDITEMNOTICE2_VALUE_ARRAY = new String[]{"编号","部门编号","消息类型"};
	
	//根据收件编号获取阶段一表制信息
	public static final String[] APP_GETFORMINFO_PARAM_ARRAY = new String[]{"applySerialNo"};
	public static final String[] APP_GETFORMINFO_VALUE_ARRAY = new String[]{"收件编号"};
	
	//获取材料的信息
	public static final String[] APP_GETATTACHMENTBYSERIANO_PARAM_ARRAY = new String[]{"applySerialNo","deptCode"};
	public static final String[] APP_GETATTACHMENTBYSERIANO_VALUE_ARRAY = new String[]{"收件编号","部门编号"};
	
	//提交审核信息，具体每一个材料的审核信息updatePreVerifyInfo
	public static final String[] APP_UPDATEPREVERIFYINFO_PARAM_ARRAY = new String[]{"applySerialNo","deptCode","verifyXmlInfo","transactorInfo"};
	public static final String[] APP_UPDATEPREVERIFYINFO_VALUE_ARRAY = new String[]{"收件编号","部门编号","具体每个材料的审核信息","经办人信息"};
	
	//获取相关参与部门的审批结果材料信息，包括审批结果材料下载地址
	public static final String[] APP_GETJGCL_PARAM_ARRAY = new String[]{"ID","deptCode"};
	public static final String[] APP_GETJGCL_VALUE_ARRAY = new String[]{"立案编号","部门编号"};
	
	//更新审批挂起状态接口
	public static final String[] APP_APPSUSPEND_PARAM_ARRAY = new String[]{"ID","deptCode","itemCode","appState","startTime","endTime","reason"};
	public static final String[] APP_APPSUSPEND_VALUE_ARRAY = new String[]{"立案编号","部门编号","事项ID","审批状态","挂起开始时间","挂起结束时间","挂起原因"};
	
	//提交项目工程信息接口（市区联动审批调用）GetQTProjectInfo
	public static final String[] APP_GETQTPROJECTINFO_PARAM_ARRAY = new String[]{"json"};
	public static final String[] APP_GETQTPROJECTINFO_VALUE_ARRAY = new String[]{"项目工程涉及信息"};
}

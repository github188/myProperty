package com.jieshun.jslifesupporter.protocol;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jht.jsif.comm.DataOperationType;
import com.jht.jsif.comm.ServiceRequestParam;
import com.jht.jsif.comm.ServiceResponseData;
import com.jht.jsif.comm.ServiceType;
import com.jht.jsif.comm.TXDataObject;

public class JSCouldProtocol {
	/**
	 * 包装请求对象
	 */
	public static ServiceRequestParam dataRequestParamPack(String serviceID,
			Map<String, Object> attributes, List<TXDataObject> dataItems) {
		ServiceRequestParam serviceRequestParam = new ServiceRequestParam(
				serviceID);
		
		serviceRequestParam.setRequestType(ServiceType.DATA);
		if (null != attributes) {
			serviceRequestParam.setAttributes(attributes);
		}
		if (null != dataItems) {
			serviceRequestParam.addDataItem(dataItems);
		}
		return serviceRequestParam;
	}

//	/**
//	 * 包装响应对象
//	 */
//	public static ServiceResponseData responseDataPack(String serviceID,
//			Map<String, Object> attributes, List<TXDataObject> dataItems,
//			int resultCode, String msg) {
//		ServiceResponseData serviceResponseData = new ServiceResponseData(
//				serviceID);
//		serviceResponseData.setResultCode(resultCode);
//
//		if (null != attributes) {
//			serviceResponseData.setAttributes(attributes);
//		}
//		if (null != dataItems) {
//			serviceResponseData.addDataItem(dataItems);
//		}
//		if (null != msg) {
//			serviceResponseData.setMessage(msg);
//		}
//		return serviceResponseData;
//	}
	
	/**
	 * 包装业务对象
	 */
	public static TXDataObject dataObjectPack(String objectID,DataOperationType dataOperationType,
			Map<String, Object> attributes, TXDataObject subItem) {
		TXDataObject  dataObject = new TXDataObject(
				objectID);
		if (null != dataOperationType) {
			dataObject.setOperateType(dataOperationType);
		}
		if (null != attributes) {
			dataObject.setAttributes(attributes);
		}
		
		if (null != subItem) {
			dataObject.addSubItem(subItem);
		}
		return dataObject;
	}
	/**
	 * 将一个 Map对象转化为一个 JavaBean
	 * 
	 * @param type
	 *            要转化的类型
	 * @param map
	 *            包含属性值的 map
	 * @return 转化出来的 JavaBean 对象
	 * @throws IntrospectionException
	 *             如果分析类属性失败
	 * @throws IllegalAccessException
	 *             如果实例化 JavaBean 失败
	 * @throws InstantiationException
	 *             如果实例化 JavaBean 失败
	 * @throws InvocationTargetException
	 *             如果调用属性的 setter 方法失败
	 */
	public static Object convertMapToJavaBean(Map<String, Object> map,
			Object object) {
		if (!map.isEmpty()) {
			for (String k : map.keySet()) {
				Object v = "";
				if (k != null && !k.equals("")) {
					v = map.get(k);
				}
				Field[] fields = null;
				fields = object.getClass().getDeclaredFields();
				for (Field field : fields) {
					if (field.getName().equals(k)) {
						field.setAccessible(true);
						try {
							field.set(object, v);
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}
		}
		return object;
	}

	/**
	 * 将一个 JavaBean 对象转化为一个 Map
	 * 
	 * @param bean
	 *            要转化的JavaBean 对象
	 * @return 转化出来的 Map 对象
	 * @throws IntrospectionException
	 *             如果分析类属性失败
	 * @throws IllegalAccessException
	 *             如果实例化 JavaBean 失败
	 * @throws InvocationTargetException
	 *             如果调用属性的 setter 方法失败
	 */
	public static Map convertJavaBeanToMap(Object object) {
		Map<String, Object> map = new HashMap<String, Object>();
		Field[] fields = null;
		fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (field.getType().getName().equals("java.lang.String")
					|| field.getType().isPrimitive()) { // 判断String或者基本数据类型
				field.setAccessible(true);
				String proName = field.getName();
				Object proValue;
				try {
					proValue = field.get(object);
					if (proValue != null) // 判断非空
						map.put(proName, proValue);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return map;
	}
}

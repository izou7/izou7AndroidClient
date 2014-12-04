package com.izouqi.client.server.webservice;

import java.util.Map;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;
import retrofit.http.QueryMap;

import com.izouqi.client.server.webservice.dto.ActivityInfoInListDto;
import com.izouqi.client.server.webservice.dto.ResponseLogin;

public interface IServerAPI {

	/**
	 * ��¼
	 * 
	 * @param rp
	 *            login param
	 * @return token
	 */
	@POST("/user/login")
	ResponseData<ResponseLogin> login(@Body RequestParam rp);

	/**
	 * �����
	 * 
	 * Query ����Ϊnull ʱ��get��url������Ӹò���
	 * 
	 * @param text
	 *            �������ݣ�null��ʾ����ȫ��
	 * @param cityId
	 *            ��������id�� null ��ʾ����ȫ��
	 * @param searchDateMap
	 *            ��������ʼʱ��㣬 �ͻ�������Ϊ����ɶԳ��֣�����ʼʱ��<=����ʱ��
	 * @param page
	 *            ҳ�룬Ĭ��Ϊ0
	 * @return null or ActivityInfoInListDto[]
	 */
	@GET("/activity/activities")
	ResponseData<ActivityInfoInListDto[]> searchActivities(
			@Query("text") String text, @Query("city") Integer cityId,
			@QueryMap Map<String, String> searchDateMap, @Query("page") int page);
}

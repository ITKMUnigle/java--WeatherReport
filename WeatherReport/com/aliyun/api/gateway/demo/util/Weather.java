package com.aliyun.api.gateway.demo.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Weather {
	//���ð������г�API����Դ����-ȫ������Ԥ����ѯ������
	public void Weather() {
	    String host = "https://ali-weather.showapi.com";
	    String path = "/ip-to-weather";
	    String method = "GET";
	    String appcode = "�ڹ�������������Լ��İ�����AppCode";
	    Map<String, String> headers = new HashMap<String, String>();
	    //�����header�еĸ�ʽ(�м���Ӣ�Ŀո�)ΪAuthorization:APPCODE 83359fd73fe94948385f570e3c139105
	    headers.put("Authorization", "APPCODE " + appcode);
	    Map<String, String> querys = new HashMap<String, String>();
	    querys.put("ip", new com.aliyun.api.gateway.demo.util.Getip().getPublicIp());
	    querys.put("need3HourForcast", "0");
	    querys.put("needAlarm", "0");
	    querys.put("needHourData", "0");
	    querys.put("needIndex", "0");
	    querys.put("needMoreDay", "0");

	    try {
	    	HttpResponse response = com.aliyun.api.gateway.demo.util.HttpUtils.doGet(host, path, method, headers, querys);
	    	String json=EntityUtils.toString(response.getEntity());
//	    	System.out.println(json);
	    	Jsonwriter(json);
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
	//��ʽ��
	public static String JsonFormat(String json) {
		String jsonString =json;
		JSONObject object = JSONObject.parseObject(jsonString);
		String pretty =  JSON.toJSONString(object, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, 
	            SerializerFeature.WriteDateUseDateFormat);
		return pretty;
	}
	//д��
	public static void Jsonwriter(String json) {
		try {
			//�жϵ�ǰ·�����Ƿ���resources�ļ���
			File dir =new File("./resources");
			if (dir.exists()) {
				System.out.println("����");
			}else {
				dir.mkdir();
			}
			//�ж�resources�ļ������Ƿ���json.txt
			File file =new File("./resources/json.txt");
			if(file.exists()) {
				file.delete();
			}else {
				file.createNewFile();
			}
			FileOutputStream witerStream = new FileOutputStream(file,true);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(witerStream,"UTF-8"));
			bw.write(JsonFormat(json));
			bw.flush();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

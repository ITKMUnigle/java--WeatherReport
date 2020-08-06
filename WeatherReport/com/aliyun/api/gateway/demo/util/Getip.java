package com.aliyun.api.gateway.demo.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Getip {
	//通过站长之家获取IP地址
    public static String getPublicIp() {
    		String ip = "";
    		String chinaz = "http://ip.chinaz.com/";
    		String inputLine = "";
    		String read = "";
    		try {
    		URL url = new URL(chinaz);
    		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
    		BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));
    		while ((read = in.readLine()) != null) {
    		inputLine += read;
    		}
//    		System.out.println(inputLine);
    		} catch (Exception e) {
    		e.printStackTrace();
    		}

    		Pattern p = Pattern.compile("<span id=\"IpValue\">(.*?)<\\/span>");
    		Matcher m = p.matcher(inputLine);
    		if(m.find()){
    		String ipstr = m.group(1);
    		ip=ipstr;
    		}
    		return ip;
    }

}
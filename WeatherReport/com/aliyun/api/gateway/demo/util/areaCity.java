package com.aliyun.api.gateway.demo.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class areaCity implements GetInfo{
	//获取省份
	public String areaCity() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？\"]";
		String regEx2="[0-9a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));
			while((line = AreaName.readLine())!=null) {
				String area="\"c5\"";
				String area2="\"c7\"";
				if(line.contains(area)||line.contains(area2)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");
//					System.out.println("你所在的省份是："+line);
					break;
				}else {
					continue;
				}
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}
	//获取地区
	public String areaName() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？\"]";
		String regEx2="[0-9a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"c3\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");					
//					System.out.println("你所在的位置是："+line);
					break;
				}else {
					continue;
				}
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;		
	}
	//获取湿度
	public String shidu() {
		String regEx="[\n`~!@#$^&*()+=|{}':;',\\[\\].<>/?~！@#￥……&*（）——+|{}【】‘；：”“’。， 、？\"]";
		String regEx2="[a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"sd\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");					
//					System.out.println("湿度："+line);
					break;
				}else {
					continue;
				}
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}
	//获取天气
	public String weather_name() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？\"]";
		String regEx2="[0-9a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"weather\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");					
//					System.out.println("天气："+line);
					break;
				}else {
					continue;
				}
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}
	//获取气温
	public String temperature() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？\"]";
		String regEx2="[a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"temperature\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");					
//					System.out.println("温度："+line+"℃");
					break;
				}else {
					continue;
				}
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}
	//获取风向
	public String wind_direction() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）_——+|{}【】‘；：”“’。， 、？\"]";
		String regEx2="[0-9a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"wind_direction\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");	
//					System.out.println("风向："+line);
					break;
				}else {
					continue;
				}
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}
	//获取天气图标
	public String weather_pic() {
		String regEx="[\n`~!@#$%^&*()+=|{}';',\\[\\]<>?~！@#￥%……&*（）_——+|{}【】‘；：”“’。， 、？\"]";
		String regEx2="weatherpic:";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"weather_pic\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");	
//					System.out.println("图片地址："+line);
					break;
				}else {
					continue;
				}
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}
	//获取风力
	public String wind_power() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）_——+|{}【】‘；：”“’。， 、？\"]";
		String regEx2="[a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"wind_power\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");					
//					System.out.println("风力是："+line);
					break;
				}else {
					continue;
				}
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;	
	}
}

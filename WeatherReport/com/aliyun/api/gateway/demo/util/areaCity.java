package com.aliyun.api.gateway.demo.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class areaCity implements GetInfo{
	//��ȡʡ��
	public String areaCity() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}�������������������� ����\"]";
		String regEx2="[0-9a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));
			while((line = AreaName.readLine())!=null) {
				String area="\"c5\"";
				String area2="\"c7\"";
				if(line.contains(area)||line.contains(area2)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");
//					System.out.println("�����ڵ�ʡ���ǣ�"+line);
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
	//��ȡ����
	public String areaName() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}�������������������� ����\"]";
		String regEx2="[0-9a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"c3\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");					
//					System.out.println("�����ڵ�λ���ǣ�"+line);
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
	//��ȡʪ��
	public String shidu() {
		String regEx="[\n`~!@#$^&*()+=|{}':;',\\[\\].<>/?~��@#������&*��������+|{}�������������������� ����\"]";
		String regEx2="[a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"sd\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");					
//					System.out.println("ʪ�ȣ�"+line);
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
	//��ȡ����
	public String weather_name() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}�������������������� ����\"]";
		String regEx2="[0-9a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"weather\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");					
//					System.out.println("������"+line);
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
	//��ȡ����
	public String temperature() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}�������������������� ����\"]";
		String regEx2="[a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"temperature\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");					
//					System.out.println("�¶ȣ�"+line+"��");
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
	//��ȡ����
	public String wind_direction() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*����_����+|{}�������������������� ����\"]";
		String regEx2="[0-9a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"wind_direction\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");	
//					System.out.println("����"+line);
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
	//��ȡ����ͼ��
	public String weather_pic() {
		String regEx="[\n`~!@#$%^&*()+=|{}';',\\[\\]<>?~��@#��%����&*����_����+|{}�������������������� ����\"]";
		String regEx2="weatherpic:";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"weather_pic\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");	
//					System.out.println("ͼƬ��ַ��"+line);
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
	//��ȡ����
	public String wind_power() {
		String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*����_����+|{}�������������������� ����\"]";
		String regEx2="[a-zA-Z]";
		String line =null;
		try {
			BufferedReader AreaName=new BufferedReader(new InputStreamReader(new FileInputStream("./resources/json.txt"),"UTF-8"));			
			while((line = AreaName.readLine())!=null) {
				String area="\"wind_power\"";
				if(line.contains(area)) {
					line=line.replaceAll("\\s*", "").replaceAll(regEx, "").replaceAll(regEx2, "");					
//					System.out.println("�����ǣ�"+line);
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

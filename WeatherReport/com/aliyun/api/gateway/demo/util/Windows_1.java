package com.aliyun.api.gateway.demo.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Windows_1 extends JFrame{
	//��ȡ��ǰʱ��
	public void setTimer(JLabel time) {
		final JLabel varTime = time;
		Timer timeAction =new Timer(100, new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				long timemillis = System.currentTimeMillis();
				// ת��������ʾ��ʽ
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				varTime.setText(df.format(new Date(timemillis)));
			}
		});
		timeAction.start();	
	}
	//������
	public  void Windows_1() {		
		areaCity City= new areaCity();
		//���崰��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setTitle("ʱ��");
		this.setBounds(100, 200, 400, 480);
		this.setVisible(true);
		
		//��ǰʱ��
		JLabel TimeLabe =new JLabel();
		TimeLabe.setForeground(Color.BLACK);		
		TimeLabe.setBounds(35, 0, 200, 95);
		TimeLabe.setFont(new Font("΢���ź�",Font.BOLD,18));
		
		//����
		JLabel areaCity=new JLabel("ʡ �� ��");
		areaCity.setForeground(Color.BLACK);		
		areaCity.setBounds(45, 100, 80, 30);
		areaCity.setFont(new Font("����", Font.BOLD, 16));
		
		JTextField areaCitytxt=new JTextField();
		areaCitytxt.setForeground(Color.BLACK);
		areaCitytxt.setBounds(115, 100, 90, 30);
		areaCitytxt.setHorizontalAlignment(JTextField.CENTER);
		areaCitytxt.setFont(new Font("����", Font.BOLD, 16));
		this.add(areaCity);
		this.add(areaCitytxt);
		
		//����
		JLabel areaName= new JLabel("�� �� ��");
		areaName.setForeground(Color.BLACK);		
		areaName.setBounds(45, 140, 80, 30);
		areaName.setFont(new Font("����", Font.BOLD, 16));
		
		JTextField areaNametxt=new JTextField();
		areaNametxt.setForeground(Color.BLACK);
		areaNametxt.setBounds(115, 140, 90, 30);
		areaNametxt.setHorizontalAlignment(JTextField.CENTER);
		areaNametxt.setFont(new Font("����", Font.BOLD, 16));
		
		this.add(areaName);
		this.add(areaNametxt);
		
		//�жϵ����ı���
		if(areaNametxt.getText()!= null) {
			areaCity setAre = new areaCity();
			String tmp_setAre=setAre.areaName();
			if (tmp_setAre!=null) {
				areaNametxt.setText(tmp_setAre);
			}else {
				areaNametxt.setForeground(Color.RED);
				areaNametxt.setFont(new Font("����", Font.BOLD, 12));
				areaNametxt.setText("δ��ȡ������");
			}
			
		}else {		
			areaNametxt.setForeground(Color.RED);
			areaNametxt.setFont(new Font("����", Font.BOLD, 12));
			areaNametxt.setText("δ��ȡ������");
		}
		//�ж�ʡ���ı���
		if(areaCitytxt.getText()!= null) {
			areaCity setAre = new areaCity();
			String tmp_setAre=setAre.areaCity();
			if (tmp_setAre!=null) {
				areaCitytxt.setText(tmp_setAre);
			}else {
				areaCitytxt.setForeground(Color.RED);
				areaCitytxt.setFont(new Font("����", Font.BOLD, 12));
				areaCitytxt.setText("δ��ȡ��ʡ��");
			}
			
		}else {		
			areaCitytxt.setForeground(Color.RED);
			areaCitytxt.setFont(new Font("����", Font.BOLD, 12));
			areaCitytxt.setText("δ��ȡ��ʡ��");
		}
		
		//����
		JLabel weather_name=new JLabel("�� �� ��");
		weather_name.setForeground(Color.BLACK);		
		weather_name.setBounds(45, 180, 80, 30);
		weather_name.setFont(new Font("����", Font.BOLD, 16));
		this.add(weather_name);
		
		JTextField weather_nametext=new JTextField();
		weather_nametext.setForeground(Color.BLACK);		
		weather_nametext.setBounds(115, 180, 90, 30);
		weather_nametext.setHorizontalAlignment(JTextField.CENTER);
		weather_nametext.setFont(new Font("����", Font.BOLD, 16));
		weather_nametext.setText(City.weather_name());
		this.add(weather_nametext);
		
		//����ͼ��
		URL tmp_path;
		try {
			tmp_path = new URL(City.weather_pic());
			BufferedImage image=ImageIO.read(tmp_path);
			JLabel p1=new JLabel(new ImageIcon(image));		
			p1.setBounds(200, 80, 160, 160);
			this.add(p1);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//����
		JLabel temperature=new JLabel("�� �� ��");
		temperature.setForeground(Color.BLACK);		
		temperature.setBounds(45, 220, 80, 30);
		temperature.setFont(new Font("����", Font.BOLD, 16));
		this.add(temperature);
		
		JTextField temperaturtext=new JTextField();
		temperaturtext.setForeground(Color.BLACK);		
		temperaturtext.setBounds(115, 220, 90, 30);
		temperaturtext.setHorizontalAlignment(JTextField.CENTER);
		temperaturtext.setFont(new Font("����", Font.BOLD, 16));
		temperaturtext.setText(City.temperature()+"��");
		this.add(temperaturtext);
		
		//��������		
		JLabel wind_direction=new JLabel("�� �� ��");
		wind_direction.setForeground(Color.BLACK);		
		wind_direction.setBounds(45, 260, 80, 30);
		wind_direction.setFont(new Font("����", Font.BOLD, 16));
		this.add(wind_direction);
		
		JTextField wind_directiontext=new JTextField();
		wind_directiontext.setForeground(Color.BLACK);		
		wind_directiontext.setBounds(115, 260, 90, 30);
		wind_directiontext.setHorizontalAlignment(JTextField.CENTER);
		wind_directiontext.setFont(new Font("����", Font.BOLD, 16));
		wind_directiontext.setText(City.wind_direction());
		this.add(wind_directiontext);
		
		JLabel wind_power=new JLabel("�� �� ��");
		wind_power.setForeground(Color.BLACK);		
		wind_power.setBounds(45, 300, 80, 30);
		wind_power.setFont(new Font("����", Font.BOLD, 16));
		this.add(wind_power);
		
		JTextField wind_powertext=new JTextField();
		wind_powertext.setForeground(Color.BLACK);		
		wind_powertext.setBounds(115, 300, 90, 30);
		wind_powertext.setHorizontalAlignment(JTextField.CENTER);
		wind_powertext.setFont(new Font("����", Font.BOLD, 16));
		wind_powertext.setText(City.wind_power());
		this.add(wind_powertext);
		
		//ʪ��
		JLabel shidu=new JLabel("ʪ �� ��");
		shidu.setForeground(Color.BLACK);		
		shidu.setBounds(45, 340, 80, 30);
		shidu.setFont(new Font("����", Font.BOLD, 16));
		this.add(shidu);
		
		JTextField shidutext=new JTextField();
		shidutext.setForeground(Color.BLACK);		
		shidutext.setBounds(115, 340, 90, 30);
		shidutext.setHorizontalAlignment(JTextField.CENTER);
		shidutext.setFont(new Font("����", Font.BOLD, 16));
		shidutext.setText(City.shidu());
		this.add(shidutext);
		

		//���������
		this.add(TimeLabe);
		this.setTimer(TimeLabe);
		
		//��ť
		JButton b1=new JButton("��ѯ");
		b1.setBounds(240, 300, 80, 30);
		this.add(b1);
		JButton b2=new JButton("�ر�");
		b2.setBounds(240, 340, 80, 30);
		this.add(b2);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Weather wea=new Weather();
				wea.Weather(); 
				Windows_1 win =new Windows_1();
				win.Windows_1();
				dispose();
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				System.exit(0);
			}
		});
		
	}	
}

package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.api.service.DemoService;
public class Consumer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/consumer.xml");
		cx.start();
		
		DemoService demoService = cx.getBean(DemoService.class);
		String infoString = demoService.getFirstDemo();
		System.out.println(infoString);
		
	}
}

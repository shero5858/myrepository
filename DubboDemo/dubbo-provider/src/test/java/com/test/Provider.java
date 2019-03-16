package com.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/provider.xml");
		cx.start();
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

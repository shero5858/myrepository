package com.dubbo.consumer;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.dubbo.api.entity.Device;
import com.dubbo.api.service.DemoService;

@Controller
@RequestMapping(value = "/")  
public class DemoControllor {

	@Resource(name="demoService")
	public DemoService demoService;
	
	@RequestMapping("/hello")
	public void print(){
		System.out.println(demoService.getFirstDemo());
	}
	
	@RequestMapping(value="/list",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getAllDevice(){
		return demoService.selectAllDevices();
	}
	
	@ResponseBody
	@RequestMapping("/findAllDevices")
	public String findAllDevices(){
		return demoService.selectAllDevices();
	}
	
	@ResponseBody
	@RequestMapping("/findAllDevObjs")
	public List<Device> findAllDevObjs(){
		return demoService.findAllDevObjs();
	}
}

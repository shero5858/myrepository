package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myssm.service.DeviceService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class TestDevice {

	@Autowired
	private DeviceService deviceService;
	
	@Test
	public void test(){
		String list = deviceService.selectAllDevices();
		System.out.println(list);
	}
}

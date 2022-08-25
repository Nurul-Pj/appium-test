package com.juaracoding.appium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.appium.pages.Day20;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class TestDay20 {
	
	private static AndroidDriver<MobileElement> driver;
	private Day20 day20;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "SM A505F");
		capabilities.setCapability("uuid", "RR8M4098AXH");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		capabilities.setCapability("appWaitDuration", "30000");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
		
	}
	
	@BeforeMethod
	public void pageObject() {
		day20 = new Day20(driver);
	}
	
	@Test(priority = 1)
	public void testAdd() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		day20.calcAdd();
		System.out.println("Hasil = "+day20.getTxtResult());
		assertEquals(day20.getTxtResult(), "4");
		day20.clear();
	}
	
	@Test(priority = 2)
	public void testKurang() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		day20.calcKurang();
		System.out.println("Hasil = "+day20.getTxtResult());
		assertEquals(day20.getTxtResult(), "3");
		day20.clear();
	}
	
	@Test(priority = 3)
	public void testKali() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		day20.calcKali();
		System.out.println("Hasil = "+day20.getTxtResult());
		assertEquals(day20.getTxtResult(), "4");
		day20.clear();
	}
	
	@Test(priority = 4)
	public void testBagi() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		day20.calcBagi();
		System.out.println("Hasil = "+day20.getTxtResult());
		assertEquals(day20.getTxtResult(), "2");
		day20.clear();
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}


}

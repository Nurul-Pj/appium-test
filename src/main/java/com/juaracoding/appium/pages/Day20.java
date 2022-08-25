package com.juaracoding.appium.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Day20 {
	
	public AndroidDriver<MobileElement> driver;
	
	public Day20 (AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Locator number
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='1']")
	private MobileElement btnSatu;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='2']")
	private MobileElement btnDua;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='3']")
	private MobileElement btnTiga;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='4']")
	private MobileElement btnEmpat;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"5\"]")
	private MobileElement btnLima;
	
//	locator aritmatika
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Plus\"]")
	private MobileElement btnAdd;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Minus\"]")
	private MobileElement btnKurang;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Perkalian\"]")
	private MobileElement btnKali;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Pembagian\"]")
	private MobileElement btnBagi;
	
	@AndroidFindBy(xpath = "")
	private MobileElement btnClear;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Setara\"]")
	private MobileElement btnEqual;
	
	
//	result
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Bidang input kalkulator\"]")
	private MobileElement hasil;
		
		public void calcAdd() {
			btnTiga.click();
			btnAdd.click();
			btnSatu.click();
			btnEqual.click();
		}
		
		public void calcKurang() {
			btnLima.click();
			btnAdd.click();
			btnDua.click();
			btnEqual.click();
		}
		
		public void calcKali() {
			btnEmpat.click();
			btnAdd.click();
			btnSatu.click();
			btnEqual.click();
		}
		
		public void calcBagi() {
			btnEmpat.click();
			btnAdd.click();
			btnDua.click();
			btnEqual.click();
		}
		
		//
		public String getTxtResult() {
			return hasil.getText();
		}
		
		public void clear(){
			btnClear.click();
		}

}

package com.eva.vtiger.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.eva.vtiger.pages.common.CommonReusableCodes;
import com.eva.vtiger.utils.WebUtil;

import lombok.Getter;

@Getter
public class BaseTest {
    
	protected WebUtil webtl=  WebUtil.getObject();
	protected CommonReusableCodes cc;
	
	
	@BeforeMethod
    public void beforeTestCase() {
		
		webtl.goToHitUrl("http://localhost:8888");
		cc=new CommonReusableCodes(webtl);

		cc.login();
    }
	
	@AfterMethod
    public void afterTestCase() {
		cc.logOut();
		webtl.printMessage("====  verifyVT001CreateAccount ends from here====");
    }
	
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("extent report object intialization");

	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("extent report finalization");

	}
	
	@BeforeTest
	public void beforeTestTag() {
		System.out.println("connect to data base");

	}
	@AfterTest
	public void afterTestTag() {
		System.out.println("disconnect to data base");

	}	
	@BeforeMethod
	public void beforeTestcase() {
		int a=1/0;
		System.out.println("Login");

	}
	@Parameters({"browser"})
	@BeforeClass
	public void beforeClass(String brname) {

		webtl.launchBrowser(brname);
		webtl.goToHitUrl("http://localhost:8888");

	}
	
	@AfterClass
	public void afterClass() {
		webtl.myQuit();
		
	}
	
	
	@AfterMethod
	public void afterTestcase() {
		System.out.println("logout");	
	}

	
	
}

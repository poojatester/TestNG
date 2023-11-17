package com.eva.vtiger.dummy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eva.vtiger.utils.WebUtil;

public class Marketing {
	private WebUtil wt = WebUtil.getObject();

	@Parameters({"browser","username","password"})
	@Test
	public void createAccount(String browser ,String username,String password) {

		wt.launchBrowser(browser);
		wt.openLoginPage("firefox");
		
		System.out.println("i am browser" + browser);
		System.out.println("i am marketing create me");
	}
//	@Test
//public void marketingSave() {
//	System.out.println(" i am marketing save method");
//}
}


package com.eva.vtiger.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eva.vtiger.pages.common.CommonReusableCodes;
import com.eva.vtiger.pages.inventry.invoice.InventoryInvoiceNewCreateInvoice;
import com.eva.vtiger.utils.WebUtil;

public class InventryInvoiceTestScripts extends BaseTest{
	
	///  requirement   Testing Logic  TestCase TestScript
	///  TDD -  Test Driven Development
	 
	WebUtil wt=WebUtil.getObject();
    @Parameters
	@Test
	public void verifyVT006AccountAndContactAddOnInvoiceForm(String brName) {
		wt.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm starts from here====");
		wt.launchBrowser(brName);
		wt.goToHitUrl("http://localhost:8888");
		CommonReusableCodes cc=new CommonReusableCodes(wt);
		cc.login();
		cc.goToInventoryInvoiceLink();
		cc.creatNewPluseButton();
		InventoryInvoiceNewCreateInvoice creatInvoice= new InventoryInvoiceNewCreateInvoice(wt);
		creatInvoice.fillUpInvoiceInformation("Test Account Name And Contact Name Addition");
		wt.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm ends from here====");

	}
   ///  cadric beust 
	
	    /////   TestNG  JUnit
	
	   ////  Cucumber   -   BDD 
	
	
	
	
	
	
	
}

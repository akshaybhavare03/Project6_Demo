package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utitlity.Baseclass;
import com.Utitlity.Library;

public class Verify_login_test extends Baseclass {
	@Test
	public void TC_001() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custome_Senkyes(login.getTxt_Email(), excel.getStringdata("Sheet1", 0, 0), "Email");
		Library.custome_Senkyes(login.getTxt_Pass(), excel.getStringdata("Sheet1", 0, 1), "Password");
		
		Assert.assertTrue(false);
		
//		Library.custome_HandaleAlert(driver).accept();
	}
}
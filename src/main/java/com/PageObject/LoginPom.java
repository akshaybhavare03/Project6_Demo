package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	@FindBy(how=How.XPATH,using="//input[@name='emai']")
	private WebElement txt_Email;
	
	@FindBy(how=How.XPATH,using="//input[@type='password']")
	private WebElement txt_Pass;
	
	@FindBy(how=How.XPATH,using="//button[contains(@name,'login')]")
	private WebElement txt_Btn;

	public WebElement getTxt_Email() {
		return txt_Email;
	}

	public WebElement getTxt_Pass() {
		return txt_Pass;
	}

	public WebElement getTxt_Btn() {
		return txt_Btn;
	}


}

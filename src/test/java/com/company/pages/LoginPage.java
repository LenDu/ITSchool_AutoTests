package com.company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Lena on 3/3/2018.
 */
public class LoginPage extends BasePage{

	@FindBy(name = "login")
	private WebElement inputLogin;

	@FindBy(name = "pass")
	private WebElement inputPassword;

	@FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
	private WebElement btnLogin;

    //login to mail from login page
	public void login(String name, String password){
		driver.jsSetValue(inputLogin, name);
		driver.jsSetValue(inputPassword, password);
	   // inputLogin.sendKeys(name);
	   // inputLogin.sendKeys(name, Keys.ENTER);
	    //inputPassword.sendKeys(password);
	    btnLogin.click();
    }
}

package com.company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

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

	@FindBy(name = "domn")
	private WebElement domen;


    //login to mail from login page
	public void login(String name, String password){
		log.info("Set input name - " + name);
//		Robot robot = null;
//		try {
//			robot = new Robot();
//		} catch (AWTException e) {
//			e.printStackTrace();
//		}
//		for(char c: "Kеt".toCharArray()){
//			robot.keyPress(c);
//			robot.keyRelease(c);
//		}
		driver.jsSetValue(inputLogin, name);
		log.info("Set input password - " + password);
		driver.jsSetValue(inputPassword, password);
	   // inputLogin.sendKeys(name);
	   // inputLogin.sendKeys(name, Keys.ENTER);
	    //inputPassword.sendKeys(password);
		// выбрать значение из дропдауна
//		Select select = new Select(domen);
//		select.selectByValue("email.ua");
	    btnLogin.click();
    }
}

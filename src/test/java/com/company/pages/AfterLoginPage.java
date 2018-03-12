package com.company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Lena on 3/8/2018.
 */
public class AfterLoginPage extends BasePage {
    @FindBy(xpath = "//li//span[@class='sn_menu_title']")
    private WebElement userEmail;

	@FindBy(xpath = "//p[@class='make_message']/a")
	private WebElement linkNewMessage;


    public String getUserEmail() {
        return userEmail.getText();
    }

    public void makeNewMessage(){
        linkNewMessage.click();
    }

}

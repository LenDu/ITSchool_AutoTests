package com.company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Lena on 3/8/2018.
 */
public class AfterLoginPage extends BasePage {
    @FindBy(xpath = "//li//span[@class='sn_menu_title']")
    private WebElement userEmail;

	@FindBy(xpath = "//p[@class='make_message']/a")
	private WebElement linkNewMessage;


    public String getUserEmail() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(userEmail));
//        new WebDriverWait(driver, 20)
//                .until(s->{s.findElement(By.xpath("//li//span[@class='sn_menu_title']"))});
        return userEmail.getText();
    }

    public void makeNewMessage(){
        linkNewMessage.click();
    }

}

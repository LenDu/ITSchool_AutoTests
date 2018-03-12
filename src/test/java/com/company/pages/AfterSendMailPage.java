package com.company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Lena on 3/9/2018.
 */
public class AfterSendMailPage extends BasePage {

	@FindBy(xpath = "//div[@class='block_confirmation']//div[@class='content clear'][1]")
	private WebElement confirmationMessage;

    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }

}

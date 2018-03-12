package com.company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Lena on 3/9/2018.
 */
public class NewMailPage extends BasePage {

	@FindBy(name = "to")
	private WebElement inputTo;

	@FindBy(name = "subject")
	private WebElement inputSubject;

	@FindBy(xpath = "//div[@class='text_editor_browser']//textarea[@name='body']")
	private WebElement inputMessageBody;

	@FindBy(xpath = "//p[@class='send_container clear']//input[@name='send']")
	private WebElement btnSendMessage;

	public void sendMail(String to, String subject, String body){
	    inputTo.sendKeys(to);
	    inputSubject.sendKeys(subject);
	    inputMessageBody.sendKeys(body);
	    btnSendMessage.click();
    }

}

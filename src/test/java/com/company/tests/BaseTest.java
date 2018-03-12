package com.company.tests;

import com.company.mails.Mail;
import com.company.mails.MailFactory;
import org.testng.annotations.AfterSuite;
import com.company.users.User;
import com.company.users.UserFactory;

/**
 * Created by Lena on 3/8/2018.
 */
public class BaseTest {
    protected static Application app = new Application();
    protected static User validUser = UserFactory.getValidUser();
    protected static Mail newMail = MailFactory.createNewMail();

    @AfterSuite
    public void tearDownSuite() throws Exception {
        app.common.stopApp();
    }
}

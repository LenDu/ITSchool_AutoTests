package com.company.tests;

import com.company.common.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

/**
 * Created by Lena on 3/3/2018.
 */

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws Exception {
        Thread.sleep(1000);
        app.login.loginValidUser();
        Assert.assertEquals(app.afterLogin.getUserEmail(), validUser.getEmail());
    }

    @Test
    public void sendMailTest() throws Exception {
        app.afterLogin.makeNewMessage();
        app.newMail.sendNewMail();
        Thread.sleep(1000);
        Assert.assertEquals(app.afterSendMail.getConfirmationMessage(), Constants.confirmationMassageRU);
    }

}

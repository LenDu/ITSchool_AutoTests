package com.company.tests;

import com.company.helpers.*;

/**
 * Created by Lena on 3/8/2018.
 */
public class Application {
    public LoginHelper login;
    public AfterLoginHelper afterLogin;
    public CommonHelper common;
    public NewMailHelper newMail;
    public AfterSendMailHelper afterSendMail;

    public Application() {
        login = new LoginHelper();
        afterLogin = new AfterLoginHelper();
        common = new CommonHelper();
        newMail = new NewMailHelper();
        afterSendMail = new AfterSendMailHelper();
    }
}

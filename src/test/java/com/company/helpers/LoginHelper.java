package com.company.helpers;

import com.company.pages.LoginPage;
import com.company.users.User;
import com.company.users.UserFactory;

/**
 * Created by Lena on 3/8/2018.
 */
public class LoginHelper extends LoginPage {

    public void loginValidUser(){
        User validUser = UserFactory.getValidUser();
        login(validUser.getLogin(), validUser.getPassword());
    }
}

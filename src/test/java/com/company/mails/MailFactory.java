package com.company.mails;

import com.company.users.User;
import com.company.users.UserFactory;

import java.util.ResourceBundle;

/**
 * Created by Lena on 3/9/2018.
 */
public class MailFactory {

    public static Mail createNewMail() {
        User user = UserFactory.getValidUser();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mail");
        return new Mail(user.getEmail(),
                user.getEmail(),
                resourceBundle.getString("subject"),
                resourceBundle.getString("body"));
    }
}

package com.company.helpers;

import com.company.mails.Mail;
import com.company.mails.MailFactory;
import com.company.pages.NewMailPage;

/**
 * Created by Lena on 3/9/2018.
 */
public class NewMailHelper extends NewMailPage {

    public void sendNewMail(){
        Mail newMail = MailFactory.createNewMail();
        sendMail(newMail.getTo(), newMail.getSubject(), newMail.getBody());
    }
}

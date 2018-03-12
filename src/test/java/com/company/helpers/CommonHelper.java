package com.company.helpers;

import com.company.pages.BasePage;

/**
 * Created by Lena on 3/8/2018.
 */
public class CommonHelper extends BasePage {

    public void stopApp(){
        driver.quit();
    }
}

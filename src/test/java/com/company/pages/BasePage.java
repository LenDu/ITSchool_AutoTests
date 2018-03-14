package com.company.pages;

import com.company.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;


/**
 * Created by Lena on 3/8/2018.
 */
public class BasePage {
    protected static WebDriver driver = DriverFactory.getDriver();

    //PageFactory - механизм инициализации драйверов
    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}

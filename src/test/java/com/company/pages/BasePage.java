package com.company.pages;

import com.company.driver.DriverFactory;
import com.company.driver.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;


/**
 * Created by Lena on 3/8/2018.
 */
public class BasePage {
    protected static MyDriver driver = MyDriver.getMyDriver();
    protected  static WebDriverWait wait= new WebDriverWait(driver,10);

    //PageFactory - механизм инициализации драйверов
    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}

package com.company.driver;

import com.company.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Lena on 3/10/2018.
 */
public class DriverFactory {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        String property = System.getProperty("driver");

        if ("firefox".equals(property)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ("ie".equals(property)) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.get(Constants.BASE_URL);
        //set a window size
        driver.manage().window().maximize();
        //set timeout for searching each element during 10 seconds
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}

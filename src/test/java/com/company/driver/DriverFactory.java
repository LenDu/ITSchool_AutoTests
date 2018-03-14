package com.company.driver;

import com.company.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;



/**
 * Created by Lena on 3/10/2018.
 */
public class DriverFactory {
    public static WebDriver driver;
    public static final String USERNAME = "elena.duplik";
    public static final String ACCESS_KEY = "4070d4e1-2955-4f51-9445-ab15d55aee11";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80";

    public static WebDriver getDriver()  {
        String property = System.getProperty("driver");

        if ("firefox".equals(property)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ("chrome".equals(property)){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if ("ie".equals(property)) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if ("remote".equals(property)) {
            try {
                DesiredCapabilities caps = DesiredCapabilities.chrome();
                caps.setCapability("platform", "Windows XP");
                caps.setCapability("version", "43.0");
                driver = new RemoteWebDriver(new URL(URL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }


            driver.get(Constants.BASE_URL);
            //set a window size
            // driver.manage().window().maximize();
            //set timeout for searching each element during 10 seconds
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        }
    }

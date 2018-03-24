package com.company.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

/**
 * Created by Lena on 3/18/2018.
 */
public class MyDriver implements WebDriver {
    private static MyDriver myDriver;
    private static WebDriver driver;
    private JavascriptExecutor js = (JavascriptExecutor) driver;

    static public MyDriver getMyDriver() {
        if (driver == null) {
            driver = DriverFactory.getDriver();
            myDriver = new MyDriver();
            return myDriver;
        } else {
            return myDriver;
        }
    }

    @Override
    public void get(String url) {
        driver.get(url);

    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }

    public void jsSetValue(WebElement webElement, String value) {
        js.executeScript("arguments[0].value='" + value + "';", webElement);
    }
}

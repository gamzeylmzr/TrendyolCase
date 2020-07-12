package com.gamzeyilmazer.base;

import com.gamzeyilmazer.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase(){

        try {
            prop = new Properties();
            FileInputStream file = new FileInputStream(System.getProperty("user.dir")+
                    "/src/main/java/com/gamzeyilmazer/config/config.properties");
            prop.load(file);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void initialize(){
        String browserName=prop.getProperty("browser");
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/com/gamzeyilmazer/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        if(browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/main/java/com/gamzeyilmazer/drivers/geckodriver.exe");
            driver=new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
    }

}

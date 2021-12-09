import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class web {
    private static WebDriver driver;
    @BeforeMethod
    public void initDrive(){
        System.setProperty("webdriver.chrome.driver","./DriverExe/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.hotels.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void quitDriver(){
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }
}

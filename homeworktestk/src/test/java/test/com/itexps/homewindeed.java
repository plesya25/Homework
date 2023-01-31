/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ukiel
 */
public class homewindeed {
      private WebDriver driver;
      private String baseUrl;
    public homewindeed() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
             driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
      @Test
  public void testIndeedTest1() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.indeed.com/");
    driver.findElement(By.id("text-input-what")).clear();
    driver.findElement(By.id("text-input-what")).sendKeys("java");
    driver.findElement(By.id("text-input-where")).click();
    driver.findElement(By.id("text-input-where")).clear();
     driver.findElement(By.id("text-input-where")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
    driver.findElement(By.id("text-input-where")).sendKeys("chicago,il");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//div[@id='jobsearch-JapanPage']/div/div/div[5]/div/div[4]")).click();
    driver.findElement(By.xpath("//div[@id='jobsearch-JapanPage']/div/div/div[5]/div/div[4]/h1")).click();
    driver.findElement(By.xpath("//div[@id='jobsearch-JapanPage']/div/div/div[5]/div/div[4]/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='jobsearch-JapanPage']/div/div/div[5]/div/div[4]/h1 | ]]
    driver.findElement(By.xpath("//div[@id='jobsearch-JapanPage']/div/div/div[5]/div/div[4]/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='jobsearch-JapanPage']/div/div/div[5]/div/div[4]/h1 | ]]
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='jobsearch-JapanPage']/div/div/div[5]/div/div[4]/h1")).getText(), "java jobs in Chicago, IL");
    } catch (Error e) {
        System.out.println(e.toString());
    }
    driver.close();
  }

}

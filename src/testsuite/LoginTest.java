package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    @Before
    public void setUp() {

    }
@Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //Enter “Admin” username
      //  WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
      // usernameField.sendKeys("Admin");
    // usernameField.sendKeys("Admin");
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

        //Enter “admin123 password
       // driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        //Click on ‘LOGIN’ button
      //  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();

        //Verify the ‘Dashboard’ text is display
    String expectedText="Dashboard";
    String actualText= driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
   Assert.assertEquals("Dashboard Text not found",expectedText,actualText);

    }


    @After
    public void closeDown() {
        closeBrowser();
    }

}

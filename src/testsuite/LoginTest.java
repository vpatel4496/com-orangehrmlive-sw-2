package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() { openBrowser(baseUrl);}

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        WebElement usernamefield = driver.findElement(By.name("txtUsername"));
        usernamefield.sendKeys("Admin");
        WebElement passwordfield = driver.findElement(By.id("txtPassword"));
        passwordfield.sendKeys("admin123");
        // Inspect loginfield by Id
        WebElement loginfield = driver.findElement(By.id("btnLogin"));
        loginfield.click();
        // Welcome Message upon login Successfully.
        String expectedMessage = "Welcome";
        String actualMessage = driver.findElement(By.partialLinkText("Welcome")).getText();

        // Validate actual and expected message
        Assert.assertNotEquals(expectedMessage,actualMessage);

    }

    public void closeBrowser(){
        driver.close();
    }
}

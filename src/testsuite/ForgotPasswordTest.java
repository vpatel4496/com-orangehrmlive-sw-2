package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() { openBrowser(baseUrl);}

    @Test

    public void verifyUserShouldNavigateToForgotPasswordPageSuccessfully(){

        WebElement forgotpasswordElement = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        forgotpasswordElement.click();

        // Verify the text ' Forgot your Password'

        String expectedMessage = "Forgot Your Password?";
        String actualMessage = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[1]/div[2]")).getText();
        Assert.assertEquals("Forgot Your Password?",actualMessage,expectedMessage);

    }
    public void closeBrowser(){ driver.quit();}

}

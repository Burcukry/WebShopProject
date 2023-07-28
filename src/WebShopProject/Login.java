package WebShopProject;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://demowebshop.tricentis.com/");

        WebElement logIn = driver.findElement(By.xpath("//*[text()='Log in']"));
        logIn.click();

        WebElement userName = driver.findElement(By.id("Email"));
        userName.sendKeys("stolegen257@gmail.com");

        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("st12345678");

        WebElement loginBttn = driver.findElement(By.cssSelector("input[value='Log in']"));
        loginBttn.click();

        WebElement successLogin = driver.findElement(By.xpath("//h2[@class='topic-html-content-header']"));

        Assert.assertTrue(successLogin.getText().contains("Welcome"), "Test failed");

    }

    @Test
    public void test2() {
        driver.get("https://demowebshop.tricentis.com/");

        WebElement logIn = driver.findElement(By.xpath("//*[text()='Log in']"));
        logIn.click();

        WebElement userName = driver.findElement(By.id("Email"));
        userName.sendKeys("stolegen257@gmail.com");

        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("st12345");

        WebElement loginBttn = driver.findElement(By.cssSelector("input[value='Log in']"));
        loginBttn.click();

        WebElement successLogin = driver.findElement(By.xpath("//span[.='Login was unsuccessful. Please correct the errors and try again.']"));

        Assert.assertTrue(successLogin.getText().contains("unsuccessful"), "Test failed");
    }

    @Test

    public void test3() {
        driver.get("https://demowebshop.tricentis.com/");

        WebElement logIn = driver.findElement(By.xpath("//*[text()='Log in']"));
        logIn.click();

        WebElement userName = driver.findElement(By.id("Email"));
        userName.sendKeys("stolegen257@gmail.com");

        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("st12345678");

        WebElement loginBttn = driver.findElement(By.cssSelector("input[value='Log in']"));
        loginBttn.click();

        WebElement AddToCart=driver.findElement(By.xpath("//div[3]/div/div[2]/div[3]/div[2]/input"));
        AddToCart.click();

        WebElement CopmleteCheckOut=driver.findElement(By.xpath("//span[.='Shopping cart']"));
        CopmleteCheckOut.click();

        WebElement Terms=driver.findElement(By.id("termsofservice"));
        Terms.click();

        WebElement CheckOut2=driver.findElement(By.id("checkout"));
        CheckOut2.click();

        WebElement Verify= driver.findElement(By.xpath("//div[@class='page-title']/h1"));

        Assert.assertTrue(Verify.getText().contains("Checkout"),"Test Failed");
    }
}

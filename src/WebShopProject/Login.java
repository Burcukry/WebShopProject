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

}

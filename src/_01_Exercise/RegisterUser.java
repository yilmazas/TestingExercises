package TestingExercises.src._01_Exercise;

import TestingExercises.src.utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RegisterUser extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://automationexercise.com/");

        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        Assert.assertEquals("https://automationexercise.com/", url);

        WebElement signUpButton= driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        signUpButton.click();

        WebElement confirmationNewUser= driver.findElement(By.xpath("//h2[text()='New User Signup!']"));

        Assert.assertEquals(confirmationNewUser.getText(), "New User Signup!");

        WebElement name= driver.findElement(By.xpath("//input[@name='name']"));
        name.sendKeys("Cihan");

        WebElement email= driver.findElement(By.xpath("(//input[@name='email'])[2]"));
        email.sendKeys("cihan@gmail.com");


    }
}

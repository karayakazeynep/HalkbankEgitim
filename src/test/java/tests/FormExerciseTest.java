package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class FormExerciseTest extends BaseTest {
    // This class is currently empty and can be used for future form-related test cases.
    @Test
    public void FormExerciseTest() {
        // Placeholder for form exercise test implementation
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement usernameElement = driver.findElement(By.id("my-text-id"));
        usernameElement.sendKeys("Test User");
        WebElement passwordElement = driver.findElement(By.id("my-password"));
        passwordElement.sendKeys("TestPassword");
        WebElement readOnlyElement = driver.findElement(By.id("my-readonly"));
        String readOnlyValue = readOnlyElement.getAttribute("value");
        System.out.println("Read-only field value: " + readOnlyValue);
        WebElement dropDownElement = driver.findElement(By.name("my-select"));
        Select selection = new Select(dropDownElement);
        selection.selectByVisibleText("Two");
        WebElement radioButtonElement = driver.findElement(By.id("my-radio-2"));
        radioButtonElement.click();
        WebElement submitButtonElement = driver.findElement(By.className("btn-outline-primary"));
        submitButtonElement.click();
        
    }
}
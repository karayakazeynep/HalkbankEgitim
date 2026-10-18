package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class DropdownTest extends BaseTest {
    @Test
    public void dropdownTest() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement dropDownElement = driver.findElement(By.name("my-select"));
        dropDownElement.click();
    }
}
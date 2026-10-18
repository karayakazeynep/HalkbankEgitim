package tests;

import org.testng.annotations.Test;

public class test  extends BaseTest{
    @Test 
    public void baseTestExample (){

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println("Sayfa Başlığı: " + driver.getTitle());
    }
}

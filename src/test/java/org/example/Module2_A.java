package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Module2_A{

    WebDriver tester;

    @Test
    public void TestingPastebin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        tester = new ChromeDriver();
        tester.get("https://pastebin.com/");
        tester.manage().window().maximize();

        Module2Task_A M2 = new Module2Task_A(tester);
        M2.enterCode();
        JavascriptExecutor js2 = (JavascriptExecutor) tester;
        js2.executeScript("window.scrollBy(0,700)", "");
        M2.selectExpiry();
        M2.enterTitle();
        M2.createPaste();
    }


}
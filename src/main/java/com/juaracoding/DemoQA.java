package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
    public static void main(String[] args) {
        String webdriver = "webdriver.chrome.driver";
        String patch = "C:\\myTools\\chromedriver.exe";
        System.setProperty(webdriver,patch );
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        System.out.println("Open Browser, Open URL");

        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        driver.findElement(By.id("userEmail")).sendKeys("info@JuaraCoding.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        js.executeScript("window.scrollBy(0,500)");//scroll vertical 500px
        driver.findElement(By.id("submit")).click();
        delay();
        driver.quit();
        System.out.println("Quit Browser");

    }
    public static void delay (){
        try {
            Thread.sleep(3000);//delay 3 detik sebelum lanjut ke coding selanjutnya
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
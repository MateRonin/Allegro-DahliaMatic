package com.allegro.dahliamatic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {

    @FindBy(xpath = "/html/body/div[3]/div[9]/div/div/div/div/div[2]/div[2]/button[1]")
    static WebElement cookies;

    @FindBy(xpath = "/html/body/div[3]/div[5]/header/div/div/div[1]/div/form/input")
    static WebElement inputField;

    @FindBy(xpath = "/html/body/div[3]/div[5]/header/div/div/div[1]/div/form/button")
    static WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"allegro.listing.sort\"]")
    static WebElement dropDown;

    @FindBy(xpath = "/html/body/div[2]/div[5]/div/div/div/div/div/div[2]/div[2]/div[3]/div/div/div/div/div/fieldset[4]/div/ul/li[2]/label")
    static WebElement checkBox;

    @FindBy(xpath = "/html/body/div[2]/div[5]/div/div/div/div/div/div[2]/div[1]/div[4]/div/div/div/div[2]/div/section[2]/article[1]/div/div[2]")
    static WebElement firstOffer;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div[2]/button[2]")
    static WebElement button;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\Chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");
        driver.manage().window().maximize();
        PageFactory.initElements(driver, AllegroTestingApp.class);
        cookies.click();
        inputField.sendKeys("Telewizor");
        searchButton.click();
        Select valueSelect = new Select(dropDown);
        valueSelect.selectByIndex(2);
        Thread.sleep(2000);
        checkBox.click();
        Thread.sleep(1000);
        checkBox.click();
        Thread.sleep(3000);
        firstOffer.click();
        Thread.sleep(2000);
        driver.quit();
}
}


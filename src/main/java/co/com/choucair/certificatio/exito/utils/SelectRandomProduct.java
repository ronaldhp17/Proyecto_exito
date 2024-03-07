package co.com.choucair.certificatio.exito.utils;

import co.com.choucair.certificatio.exito.userinterfaces.SelectProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectRandomProduct {
    private final WebDriver driver;

    public SelectRandomProduct(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> scanElements(By locator) {
        return driver.findElements(locator);
    }
}

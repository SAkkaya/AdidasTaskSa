package com.adidas.test;

import com.adidas.TestBaseAdidas;
import com.adidas.pages.AdidasHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicNavigationWithTestNG extends TestBaseAdidas {

    @Test
    public void testNavigation(){

        AdidasHomePage homePage = new AdidasHomePage();
        homePage.Laptops.click();

//        String title = driver.getTitle();
//        System.out.println("title = " + title);

        wait.until(ExpectedConditions.visibilityOf(homePage.Sony));

        Assert.assertTrue(homePage.Sony.isDisplayed());


    }



}
package com.example.testtask;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchItemTests extends TestBase {

    @Test
            public void testItem(){

        goToMarket();

        switchToNexTab();

        selectComputersDepartment();
        filterItem(new Item("planshety", "20000", "35000", "Apple"));
       /* WebElement item = wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][2]"));
        String itemName = item.findElement(By.xpath(".//h3")).getText(); - поиск элемента внутри страницы по Хпассу, с определенного элемента,с помощью (точки)
         это является значительным отличием от сэссселектора., мы можем начать поиск внутри одного элемента или класса с дальнейшем поиском внутри */
        String itemName = wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][2]")).getText();

        System.out.println(itemName);

    }

}


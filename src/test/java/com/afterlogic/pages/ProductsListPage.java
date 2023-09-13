package com.afterlogic.pages;

import com.afterlogic.tests.TestData;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.afterlogic.tests.TestData.productsListName;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsListPage {
    private SelenideElement
            purchaseTab = $(".item102"),
            productsListLink = $("[href='/purchase/order-online']");
    private ElementsCollection productsList = $$(".products-list h3");

    @Step("Переходим на страницу со списком продуктов")
    public ProductsListPage openAllProductsList() {
        purchaseTab.hover().$(byText(productsListName)).hover();
        productsListLink.click();
        return this;
    }

    @Step("Проверяем наличие всех продуктов в списке")
    public ProductsListPage checkProductTitles(List<String> productNames) {
        productsList.shouldHave(texts(TestData.productNames));
        return this;

    }
}

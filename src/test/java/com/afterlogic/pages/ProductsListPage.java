package com.afterlogic.pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsListPage {
    private ElementsCollection productsList = $$(".products-list h3");

    @Step("Проверяем наличие всех продуктов в списке")
    public ProductsListPage checkProductTitles(List<String> value) {
        productsList.shouldHave(texts(value));
        return this;

    }
}

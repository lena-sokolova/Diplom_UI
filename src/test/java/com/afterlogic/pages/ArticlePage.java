package com.afterlogic.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ArticlePage {
    private SelenideElement
            searchResultTitle = $("h1.title");

    @Step("Проверяем, что нужная статья документации открылась")
    public ArticlePage checkOpenedArticle(String value) {
        searchResultTitle.shouldHave(text(value));
        return this;
    }
}

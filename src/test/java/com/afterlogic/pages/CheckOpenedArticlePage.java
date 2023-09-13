package com.afterlogic.pages;

import com.afterlogic.tests.TestData;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckOpenedArticlePage {
    private SelenideElement
            searchResult = $("#j1_42_anchor"),
            searchResultTitle = $("h1.title");

    @Step("Переходим на страницу найденной статьи")
    public CheckOpenedArticlePage openSearchResult() {
        searchResult.click();
        return this;
    }

    @Step("Проверяем, что нужная статья документации открылась")
    public CheckOpenedArticlePage checkOpenedArticle(String searchResultText) {
        searchResultTitle.shouldHave(text(TestData.searchResultText));
        return this;
    }
}

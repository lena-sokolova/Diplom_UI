package com.afterlogic.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AuroraDocumentationPage {

    private SelenideElement
            searchInput = $("#search_input"),
            searchResult = $("#j1_42_anchor");

    @Step("Вводим запрос в поисковую строку")
    public AuroraDocumentationPage searchDocumentation(String value) {
        searchInput.click();
        searchInput.setValue(value).pressEnter();
        return this;
    }

    @Step("Проверяем, что нужная статья документации найдена")
    public AuroraDocumentationPage checkSearchResult(String value) {
        searchResult.shouldHave(text(value));
        return this;
    }

    @Step("Переходим на страницу найденной статьи")
    public AuroraDocumentationPage openSearchResult() {
        searchResult.click();
        return this;
    }
}

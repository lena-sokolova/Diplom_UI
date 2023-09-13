package com.afterlogic.pages;

import com.afterlogic.tests.TestData;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.afterlogic.tests.TestData.searchKey;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchDocumentationPage {

    private SelenideElement
            searchInput = $("#search_input"),
            searchResult = $("#j1_42_anchor");

    @Step("Вводим запрос в поисковую строку")
    public SearchDocumentationPage searchDocumentation() {
        searchInput.click();
        searchInput.setValue(searchKey).pressEnter();
        return this;
    }

    @Step("Проверяем, что нужная статья документации найдена")
    public SearchDocumentationPage checkSearchResult(String searchResultText) {
        searchResult.shouldHave(text(TestData.searchResultText));
        return this;
    }
}

package com.afterlogic.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class NewsPage {
    private SelenideElement
            newsTextTitle = $("h2.title");

    @Step("Проверяем успешный переход на страницу новостей")
    public NewsPage checkOpenNewsSection(String value) {
        newsTextTitle.shouldHave(text(value));
        return this;
    }
}

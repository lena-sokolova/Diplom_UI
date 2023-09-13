package com.afterlogic.pages;

import com.afterlogic.tests.TestData;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.afterlogic.tests.TestData.newsSectionName;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class NewsPage {
    private SelenideElement
            aboutTab = $(".item112"),
            newsLink = $("[href='/news']"),
            newsTextTitle = $("h2.title");

    @Step("Открываем раздел новостей")
    public NewsPage openNews() {
        aboutTab.hover().$(byText(newsSectionName)).hover();
        newsLink.click();
        return this;
    }

    @Step("Проверяем успешный переход на страницу новостей")
    public NewsPage checkOpenNewsSection(String newsTitle) {
        newsTextTitle.shouldHave(text(TestData.newsTitle));
        return this;
    }
}

package com.afterlogic.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.afterlogic.tests.TestData.*;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private SelenideElement
            homeText = $(".home-hero"),
            mainBlock = $(".main_block");

    private ElementsCollection tabsBar = $$("#main-menu a.l1");

    @Step("Открываем главную страницу")
    public MainPage openPage() {
        open(baseUrl);
        $(mainBlock).shouldBe(visible);
        return this;
    }

    @Step("Проверяем отображение информации о компании")
    public MainPage checkHomePageText() {
        homeText.shouldHave(text(successOpenPageText));
        return this;
    }

    @Step("Проверяем наличие всех табов на странице")
    public MainPage checkTabsTitles() {
        tabsBar.shouldHave(texts(tabsTitles));
        return this;
    }
}

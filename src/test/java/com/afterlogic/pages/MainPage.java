package com.afterlogic.pages;

import com.afterlogic.tests.TestData;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private SelenideElement
            homeText = $(".home-hero"),
            mainBlock = $(".main_block"),
            purchaseTab = $(".item102"),
            productsListLink = $("[href='/purchase/order-online']"),
            aboutTab = $(".item112"),
            contactUsLink = $("[href='/contact']"),
            newsLink = $("[href='/news']"),
            privacyPolicyLink = $("[href='/privacy-policy']"),
            supportTab = $(".item106"),
            documentationListLink = $("[href='/docs']");

    private ElementsCollection tabsBar = $$("#main-menu a.l1");

    @Step("Открываем главную страницу")
    public MainPage openPage() {
        open(baseUrl);
        $(mainBlock).shouldBe(visible, Duration.ofSeconds(10));
        return this;
    }

    @Step("Проверяем отображение информации о компании")
    public MainPage checkHomePageText(String value) {
        homeText.shouldHave(text(value));
        return this;
    }

    @Step("Проверяем наличие всех табов на странице")
    public MainPage checkTabsTitles(List<String> value) {
        tabsBar.shouldHave(texts(value));
        return this;
    }

    @Step("Переходим на страницу со списком продуктов")
    public MainPage openAllProductsList(String value) {
        purchaseTab.hover().$(byText(value)).hover();
        productsListLink.click();
        return this;
    }

    @Step("Переходим к форме обратной связи")
    public MainPage openContactForm(String value) {
        aboutTab.hover().$(byText(value)).hover();
        contactUsLink.click();
        return this;
    }

    @Step("Открываем раздел новостей")
    public MainPage openNews(String value) {
        aboutTab.hover().$(byText(value)).hover();
        newsLink.click();
        return this;
    }

    @Step("Открываем раздел политики конфиденциальности")
    public MainPage openPrivacyPolicyTerms() {
        privacyPolicyLink.click();
        return this;
    }

    @Step("Переходим в раздел онлайн документации")
    public MainPage openDocumentationList(String value) {
        supportTab.hover().$(byText(value)).hover();
        documentationListLink.click();
        return this;
    }
}

package com.afterlogic.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.afterlogic.tests.TestData.documentationList;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DocumentationPage {
    private SelenideElement
            supportTab = $(".item106"),
            documentationListLink = $("[href='/docs']");

    @Step("Переходим в раздел онлайн документации")
    public DocumentationPage openDocumentationList() {
        supportTab.hover().$(byText(documentationList)).hover();
        documentationListLink.click();
        return this;
    }
}

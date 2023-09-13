package com.afterlogic.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class AuroraDocumentationPage {
    private SelenideElement
            auroraDocumentationLink = $("a[href='/docs/aurora/']");

    @Step("Переходим в раздел документации продукта Aurora Corporate")
    public AuroraDocumentationPage openAuroraDocumentation() {
        auroraDocumentationLink.click();
        return this;
    }
}

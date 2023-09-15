package com.afterlogic.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PrivacyPolicyPage {
    private SelenideElement
            privacyPolicyTitle = $("h1");

    @Step("Проверяем успешный переход на страницу политики конфиденциальности")
    public PrivacyPolicyPage checkOpenPrivacyPolicyTerms(String value) {
        privacyPolicyTitle.shouldHave(text(value));
        return this;
    }
}

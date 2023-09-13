package com.afterlogic.pages;

import com.afterlogic.tests.TestData;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PrivacyPolicyPage {
    private SelenideElement
            privacyPolicyLink = $("[href='/privacy-policy']"),
            privacyPolicyTitle = $("h1");

    @Step("Открываем раздел политики конфиденциальности")
    public PrivacyPolicyPage openPrivacyPolicyTerms() {
        privacyPolicyLink.click();
        return this;
    }

    @Step("Проверяем успешный переход на страницу политики конфиденциальности")
    public PrivacyPolicyPage checkOpenPrivacyPolicyTerms(String privacyPolicyTitleName) {
        privacyPolicyTitle.shouldHave(text(TestData.privacyPolicyTitleName));
        return this;
    }
}

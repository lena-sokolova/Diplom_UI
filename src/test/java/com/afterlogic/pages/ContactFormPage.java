package com.afterlogic.pages;

import com.afterlogic.tests.TestData;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.afterlogic.tests.TestData.contactFormName;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ContactFormPage {
    private SelenideElement
            aboutTab = $(".item112"),
            contactUsLink = $("[href='/contact']"),
            companyName = $("#jform_company"),
            yourName = $("#jform_name"),
            phoneNumber = $("#jform_phone"),
            email = $("#jform_email"),
            message = $("#jform_message"),
            sendBtn = $(".button"),
            sendMessageText = $(".alert-message");

    @Step("Переходим к форме обратной связи")
    public ContactFormPage openContactForm() {
        aboutTab.hover().$(byText(contactFormName)).hover();
        contactUsLink.click();
        return this;
    }

    @Step("Заполняем поле Company/Organization name")
    public ContactFormPage setCompanyName(String value) {
        companyName.setValue(value);
        return this;
    }

    @Step("Заполняем поле Your name")
    public ContactFormPage setYourName(String value) {
        yourName.setValue(value);
        return this;
    }

    @Step("Заполняем поле Phone number")
    public ContactFormPage setPhoneNumber(String value) {
        phoneNumber.setValue(value);
        return this;
    }

    @Step("Заполняем поле Email")
    public ContactFormPage setEmail(String value) {
        email.setValue(value);
        return this;
    }

    @Step("Заполняем поле Message")
    public ContactFormPage setMessage(String value) {
        message.setValue(value);
        return this;
    }

    @Step("Отправляем сообщение")
    public ContactFormPage clickSendBtn() {
        sendBtn.click();
        return this;
    }

    @Step("Проверяем, что сообщение успешно отправлено")
    public ContactFormPage checkSuccessSendMessageText(String successSendMessageText) {
        sendMessageText.shouldHave(text(TestData.successSendMessageText));
        return this;
    }
}

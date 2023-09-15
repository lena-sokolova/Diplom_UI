package com.afterlogic.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ContactFormPage {
    private SelenideElement
            companyName = $("#jform_company"),
            yourName = $("#jform_name"),
            phoneNumber = $("#jform_phone"),
            email = $("#jform_email"),
            message = $("#jform_message"),
            sendBtn = $(".button"),
            sendMessageText = $(".alert-message");

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
    public ContactFormPage checkSuccessSendMessageText(String value) {
        sendMessageText.shouldHave(text(value));
        return this;
    }
}

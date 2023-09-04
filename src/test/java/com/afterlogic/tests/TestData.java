package com.afterlogic.tests;

import com.github.javafaker.Faker;

import java.util.List;

import static com.afterlogic.utils.RandomUtils.getRandomMessage;

public class TestData {

    public static String successOpenPageText = "Afterlogic Corp. is an award-winning technological company",
            productsListName = "All Products",
            contactFormName = "Contact",
            successSendMessageText = "Thank you for your inquiry.\n" +
                    "Your message will be processed as soon as possible.",
            newsSectionName = "News",
            newsTitle = "Release of Aurora Corporate and WebMail Pro 9.7.1",
            privacyPolicyTitleName = "Privacy policy",
            documentationList = "Online documentation",
            searchKey = "Two-factor",
            searchResultText = "Two-factor authentication";

    public static List<String> tabsTitles = List.of("Products", "Purchase", "Support", "Our Clients", "Services",
            "About"),
            productNames = List.of("Afterlogic Aurora Corporate", "Afterlogic WebMail Pro PHP",
                    "Afterlogic WebMail Pro ASP.NET", "Afterlogic ActiveServer", "Afterlogic MailSuite Pro for Linux",
                    "MailBee.NET Objects", "MailBee Objects");

    Faker faker = new Faker();

    String companyName = faker.company().name(),
            userName = faker.name().firstName(),
            userEmail = faker.internet().emailAddress(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            message = getRandomMessage();
}
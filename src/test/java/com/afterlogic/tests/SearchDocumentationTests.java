package com.afterlogic.tests;

import com.afterlogic.pages.*;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.afterlogic.tests.TestData.searchResultText;

public class SearchDocumentationTests extends TestBase {

    MainPage mainPage = new MainPage();
    DocumentationPage openDocumentationPage = new DocumentationPage();
    AuroraDocumentationPage openAuroraDocumentation = new AuroraDocumentationPage();
    SearchDocumentationPage searchDocumentationPage = new SearchDocumentationPage();
    CheckOpenedArticlePage checkOpenedArticlePage = new CheckOpenedArticlePage();

    @Test
    @Owner("Elena Sokolova")
    @Tag("smoke")
    @DisplayName("Проверка поиска в документации Aurora Corporate")
    void successfulSearchDocumentationTest() {
        mainPage
                .openPage();
        openDocumentationPage
                .openDocumentationList();
        openAuroraDocumentation
                .openAuroraDocumentation();
        searchDocumentationPage
                .searchDocumentation()
                .checkSearchResult(searchResultText);
        checkOpenedArticlePage
                .openSearchResult()
                .checkOpenedArticle(searchResultText);
    }
}

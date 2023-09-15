package com.afterlogic.tests;

import com.afterlogic.pages.ArticlePage;
import com.afterlogic.pages.AuroraDocumentationPage;
import com.afterlogic.pages.DocumentationPage;
import com.afterlogic.pages.MainPage;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.afterlogic.tests.TestData.*;

public class SearchDocumentationTests extends TestBase {

    MainPage mainPage = new MainPage();
    DocumentationPage documentationPage = new DocumentationPage();
    AuroraDocumentationPage auroraDocumentationPage = new AuroraDocumentationPage();
    ArticlePage articlePage = new ArticlePage();

    @Test
    @Owner("Elena Sokolova")
    @Tag("smoke")
    @DisplayName("Проверка поиска в документации Aurora Corporate")
    void successfulSearchDocumentationTest() {
        mainPage
                .openPage()
                .openDocumentationList(documentationList);
        documentationPage
                .openAuroraDocumentation();
        auroraDocumentationPage
                .searchDocumentation(searchKey)
                .checkSearchResult(searchResultText)
                .openSearchResult();
        articlePage
                .checkOpenedArticle(searchResultText);
    }
}

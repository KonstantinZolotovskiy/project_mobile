package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OnboardingPageTests extends TestBase {
    @Test
    @Owner("Konstantin Zolotovskiy")
    @DisplayName("Проверка текста вводных страниц")
    void gettingStartedTest() {
        String firstPageText = "The Free Encyclopedia";
        String secondPageText = "New ways to explore";
        String thirdPageText = "Reading lists with sync";
        String fourthPageText = "Send anonymous data";

        onboardingPage.checkTextOnPage(firstPageText);
        onboardingPage.clickContinueButton();
        onboardingPage.checkTextOnPage(secondPageText);
        onboardingPage.clickContinueButton();
        onboardingPage.checkTextOnPage(thirdPageText);
        onboardingPage.clickContinueButton();
        onboardingPage.checkTextOnPage(fourthPageText);
    }

    @Test
    @Owner("Konstantin Zolotovskiy")
    @DisplayName("Проверка кнопки \"SKIP\"")
    void skipButtonTest() {
        onboardingPage.skipAndCheck();
    }

    @Test
    @Owner("Konstantin Zolotovskiy")
    @DisplayName("Проверка возможности добавления языков")
    void addLanguageTest() {
        onboardingPage.checkAddOrEditLanguages();
    }
}
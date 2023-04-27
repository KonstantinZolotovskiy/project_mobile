package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.OnboardingPage;

@Owner("Konstantin Zolotovskiy")
public class MainPageTest extends TestBase {

    OnboardingPage onboardingPage = new OnboardingPage();
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка доступности страницы \"Settings\" ")
    void checkSettingsPageTest() {
        onboardingPage.skipAndCheck();
        mainPage.checkSettings();
    }
}

package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTest extends TestBase {
    @Test
    @Owner("Konstantin Zolotovskiy")
    @DisplayName("Проверка доступности страницы \"Settings\" ")
    void checkSettingsPageTest() {
        onboardingPage.skipAndCheck();
        mainPage.checkSettings();
    }
}

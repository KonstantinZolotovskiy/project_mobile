package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("Konstantin Zolotovskiy")
public class MainPageTest extends TestBase {
    @Test
    @DisplayName("Проверка доступности страницы \"Settings\" ")
    void checkSettingsPageTest() {
        onboardingPage.skipAndCheck();
        mainPage.checkSettings();
    }
}

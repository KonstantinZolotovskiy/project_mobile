package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MainPage {
    SelenideElement
            moreButton = $(id("org.wikipedia.alpha:id/menu_icon")),
            settingsButton = $(id("org.wikipedia.alpha:id/main_drawer_settings_container")),
            settingsTitle = $(id("org.wikipedia.alpha:id/action_bar"));

    @Step("Проверка доступности страницы \"Settings\"")
    public void checkSettings() {
        moreButton.shouldBe(visible).click();
        settingsButton.shouldBe(visible).click();
        settingsTitle.shouldBe(visible);
    }
}
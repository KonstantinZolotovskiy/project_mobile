package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingPage {
    private SelenideElement
            pageText = $(id("org.wikipedia.alpha:id/primaryTextView")),
            skipButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")),
            continueButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            title = $(id("org.wikipedia.alpha:id/main_toolbar_wordmark")),
            addOrEditLanguageButton = $(id("org.wikipedia.alpha:id/addLangContainer")),
            addLanguageButton = $(id("org.wikipedia.alpha:id/wiki_language_title"));

    @Step("Проверить текст на странице")
    public void checkTextOnPage(String text) {
        pageText.shouldHave(text(text));
    }

    @Step("Нажать кнопку \"CONTINUE\"")
    public void clickContinueButton() {
        continueButton.shouldBe(visible).click();
    }

    @Step("Нажать кнопку \"SKIP\" и проверить заголовок")
    public void skipAndCheck() {
        skipButton.shouldBe(visible).click();
        title.shouldBe(exist);
    }

    @Step("Проверка возможности добавления языков")
    public void checkAddOrEditLanguages() {
        addOrEditLanguageButton.shouldBe(visible).click();
        addLanguageButton.shouldBe(visible);
    }
}
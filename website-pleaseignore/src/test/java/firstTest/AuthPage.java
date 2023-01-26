package firstTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AuthPage {
    private final String NAME = "rusdev";
    private final String PASSWORD = "1234Test";
    private final SelenideElement loginButton = $x("//input[@value='Login']");


    public void createUser() {
        $(new ByText("Create Account")).click();
//        $(By.className("page-header")).shouldHave(Condition.text("Registration"));
    }
//
//    public void forgotPassword() {
//
//    }

    public void authUser() {

        $(By.name("username")).setValue(NAME);
//        $(By.name("password")).setValue(PASSWORD).pressEnter();

        // 2 variant
        $(By.name("password")).setValue(PASSWORD);
        Selenide.$(loginButton).click();
        String text ="Your Profile";
        $(By.tagName("h1")).shouldHave(Condition.text(text));

//        Selenide.$("//div[@class='page-header']();").shouldHave(Condition.text("Your"));
//        Selenide.$("h1").shouldHave(Condition.value("Your Profile"));
        sleep(1000);
    }
}

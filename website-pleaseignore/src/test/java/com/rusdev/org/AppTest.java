package com.rusdev.org;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        String url = "https://pleaseignore.com/";
        open(url);

        $(new ByText("Auth")).click();

        // positiv
        $(new ByText("Create Account")).click();
        $(By.className("page-header")).shouldHave(Condition.text("Registration"));
        sleep(3000);


//      assertTrue( true );
    }
}

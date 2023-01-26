package firstTest;

import org.junit.Test;

public class WebTest extends BaseTest {

    private final static String URL = "https://pleaseignore.com/";

    @Test
    public void MainPage() {
        MainPage mainPage = new MainPage(URL);
//        mainPage.openBrowser(URL);
        mainPage.pressButton();

        AuthPage authPage = new AuthPage();
        authPage.authUser();
    }
}
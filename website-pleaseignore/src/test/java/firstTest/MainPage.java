
package firstTest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.*;


/**
 * Main page site
 */
public class MainPage {

    public MainPage(String url) {
        Selenide.open(url);
    }

    public void pressButton() {
        $(new ByText("Auth")).click();
    }


    /**
     * Open chrome brouser
     *
     * @param url http://...
     */
    public void openBrowser(String url) {
        Selenide.open(url);
    }
}

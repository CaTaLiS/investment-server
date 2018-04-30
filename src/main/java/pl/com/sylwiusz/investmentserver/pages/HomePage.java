package pl.com.sylwiusz.investmentserver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class HomePage extends LoadableComponent<HomePage> {

    @FindBy(id = "login_form_btn")
    private WebElement loginFormBtn;

    @FindBy(name = "j_username")
    private WebElement loginTextField;

    @FindBy(name = "password")
    private WebElement passwordTextField;

    @FindBy(name = "submit")
    private WebElement loginBtn;

    private static final String URL = "https://union-investment.pl/contents/pl/klient-indywidualny/strona-glowna";

    private WebDriver webDriver;


    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @Override
    public void load() {
        webDriver.get(URL);
    }

    @Override
    public void isLoaded() throws Error {

    }

    public WebElement getLoginFormBtn() {
        return loginFormBtn;
    }

    public WebElement getLoginTextField() {
        return loginTextField;
    }

    public WebElement getPasswordTextField() {
        return passwordTextField;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }
}

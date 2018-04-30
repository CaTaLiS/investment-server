package pl.com.sylwiusz.investmentserver.services;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.sylwiusz.investmentserver.pages.HomePage;

@Service
public class UnionInvestmentService {

    private WebDriver webDriver;

    @Autowired
    public UnionInvestmentService(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.manage().window().fullscreen();
    }

    public boolean login(String login, String password) throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.load();
        homePage.getLoginFormBtn().click();
        homePage.getLoginTextField().sendKeys(login);
        homePage.getPasswordTextField().sendKeys(password);

        webDriver.wait(10000L);

        return true;
    }
}

package pl.com.sylwiusz.investmentserver.pages;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HomePageTest {

    @Autowired
    private WebDriver webDriver;

    private HomePage homePage;

    @Before
    public void setUp() {
        homePage = new HomePage(webDriver);
    }

    @Test
    public void shouldLoadPageCorrectly() {
        // given

        // when
        homePage.load();

        // then
        assertThat(webDriver.getTitle()).isEqualTo("Fundusze Inwestycyjne Union Investment");
    }

    @Test
    public void shouldLoginToSystem() {

    }

}
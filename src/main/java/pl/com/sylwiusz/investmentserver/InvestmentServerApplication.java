package pl.com.sylwiusz.investmentserver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InvestmentServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentServerApplication.class, args);
	}

	@Bean
	public WebDriver webDriver() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		return new ChromeDriver();
	}
}

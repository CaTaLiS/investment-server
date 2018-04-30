package pl.com.sylwiusz.investmentserver.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UnionInvestmentServiceTest {

    @Autowired
    private UnionInvestmentService unionInvestmentService;

    @Test
    public void shouldLoginToUnionInvestmentWhenCorrectCredsProvided() throws InterruptedException {
        // given
        final String login = "login";
        final String password = "password";

        // when
        boolean logged = unionInvestmentService.login(login, password);

        // then
        assertThat(logged).isTrue();
    }

}
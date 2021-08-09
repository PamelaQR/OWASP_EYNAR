package testcases;

import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObject.LoginModal;
import pageObject.MainPage;
import session.Sesion;

public class TodoLyTest {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();

    @BeforeEach
    public void before(){
        Sesion.getInstance().getDriver().get("http://todo.ly");
    }


    @DisplayName("Verificar la ejecucion del Login TodoLy")
    @Description("Este test es para verificar Login TodoLy ....")
    @Link("jira.com/10102")
    @Issue("Bug001")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void verifyProjectIsLogged(){
        mainPage.loginButton.click();
        loginModal.emailTextBox.setValue("pamela@noexiste.com");
        loginModal.passwordTextBox.setValue("1232434");
        loginModal.loginButton.click();

        // verificaciones


    }
    @AfterEach
    public void after(){
        Sesion.getInstance().closeSesion();
    }

}

import Pages.LoginPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static Base.Data.email;
import static Base.Data.password;
import static java.lang.Thread.sleep;

public class LoginTests {

    LoginPage loginPage = new LoginPage();

    @Test(description = "Başarılı Login Kullanıcı Giriş Kontrol")
    @Severity(SeverityLevel.CRITICAL)
    public void loginSuccesfully() throws InterruptedException {
        loginPage
                .emailDoldur(email)
                .passwordDoldur(password)
                .loginTikla();

        sleep(5000);
    }
    @Test(description = "Başarılı Login İşlemi")
    public void loginSuccessful() throws InterruptedException{

        loginPage
                .emailDoldur(email)
                .devamTikla()
                .passwordDoldur(password)
                .loginTikla();
        sleep(3000);
        loginPage.hesabimGirisKontrolu("Hesabım");
    }
}

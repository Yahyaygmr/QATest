import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test(description = "Başarılı login.")
    public void loginSuccessful() throws InterruptedException{
        sleep(4000);
        loginPage
                .emailDoldur(email)
                .passwordDoldur(password)
                .girisYapTikla();
        sleep(5000);
        //homePage.hesabimKontrol();

    }
}

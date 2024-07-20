package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import static Base.BaseTest.driver;

public class LoginPage extends BaseLibrary {
    @Step("Email Alanı Doldurulur")
    public LoginPage emailDoldur(String email) {
        driver.findElement(By.name("emailAndPhone")).sendKeys(email);
        return this;
    }

    @Step("Parola Alanı Doldurulur")
    public LoginPage passwordDoldur(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
        screenshot();
        return this;
    }

    @Step("Login Butonuna Tıklanır")
    public LoginPage loginTikla() {
        driver.findElement(By.cssSelector("[class='login-form__button login-form__button--bg-blue']")).click();
        return this;
    }

    @Step("Login Sayfası Devam Butonuna Tıklanır")
    public LoginPage devamTikla() throws InterruptedException {
        driver.findElement(By.cssSelector("[class='login-form__button login-form__button--bg-blue']")).click();
        sleep(1000);
        return this;
    }

    @Step("Hesabım GirişKontrolü: {text}")
    public LoginPage hesabimGirisKontrolu(String text) {
        String value = driver.findElements(By.cssSelector("[class='dropdown-label']")).get(0).getText();
        Assert.assertEquals(text, value);
        return this;
    }
    @Step("Hata Mesajı Kontrolü: {text}")
    public LoginPage hataMesajiKontrolu(String text) {
        String value = driver.findElement(By.cssSelector("[class='message']")).getText();
        screenshot();
        Assert.assertEquals(text, value);
        return this;
    }

    @Step("Email Alanı İçeriği Temizlenir")
    public LoginPage emailTemizle() {
        driver.findElement(By.name("login email")).clear();
        return this;
    }
    @Step("Password İçeriğini Temizler")
    public LoginPage passwordTemizle() {
        driver.findElement(By.name("login-password")).clear();
        return this;
    }
}

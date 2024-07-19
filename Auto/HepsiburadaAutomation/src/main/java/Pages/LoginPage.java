package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseLibrary {
    @Step("Email Alanı Doldurulur")
    public LoginPage emailDoldur(String email) {
        driver.findElement(By.name("username")).sendKeys(email);
        return this;
    }

    @Step("Parola Alanı Doldurulur")
    public LoginPage passwordDoldur(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
        screenshot();
        return this;
    }

    @Step("Giriş Yap Butonuna Tıklanır")
    public LoginPage girisYapTikla() {
        driver.findElement(By.name("btnLogin")).click();
        return this;
    }

    @Step("Hata Mesajı Kontrolü: {text}")
    public LoginPage hataMesajiKontrolu(String text) {
        String value = driver.findElement(By.cssSelector("[class='hb-fznKot cTSul sgzcudliler']")).getText();
        screenshot();
        Assert.assertEquals(text, value);
        return this;
    }

    @Step("Email Alanı İçeriği Temizlenir")
    public LoginPage emailTemizle() {
        driver.findElement(By.name("username")).clear();
        return this;
    }
    @Step("Password İçeriğini Temizler")
    public LoginPage passwordTemizle() {
        driver.findElement(By.name("password")).clear();
        return this;
    }
}

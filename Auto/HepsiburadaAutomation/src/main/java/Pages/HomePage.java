package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BaseLibrary {

    @Step("Hesabım Alanı Görüntüleme Kontrolü")
    public HomePage hesabimKontrol()
    {
        String value = driver.findElement(By.cssSelector("[class='sf-OldMyAccount-d0xCHLV38UCH5cD9mOXq'] p")).getText();
        screenshot();
        Assert.assertEquals("Hesabım", value);
        return this;
    }
}

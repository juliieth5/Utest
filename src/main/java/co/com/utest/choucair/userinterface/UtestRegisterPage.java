package co.com.utest.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("Button to begin the register")
            .located(By.xpath("(//*[text()='Join Today'])[1]"));
}

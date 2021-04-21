package co.com.utest.choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage {

    public static final Target BUTTON_LAST_STEP = Target.the("next to the last step")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));


}

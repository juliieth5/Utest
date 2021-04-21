package co.com.utest.choucair.tasks;

import co.com.utest.choucair.userinterface.UbicationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class Ubication implements Task {

    private String strCity;
    private String strPostalCode;

    public Ubication(String strCity, String strPostalCode) {
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
    }

    public static Ubication TheForm(String strCity, String strPostalCode) {

        return Tasks.instrumented(Ubication.class,strCity,strPostalCode);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Enter.theValue(strCity).into(UbicationPage.INPUT_CITY),
                SendKeys.of(Keys.ARROW_DOWN).into(UbicationPage.INPUT_CITY),
                SendKeys.of(Keys.ENTER).into(UbicationPage.INPUT_CITY),
                Enter.theValue(strPostalCode).into(UbicationPage.INPUT_POSTAL_CODE),
                Click.on(UbicationPage.BUTTON_DEVICES));

    }
}

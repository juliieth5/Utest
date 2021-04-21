package co.com.utest.choucair.tasks;

import co.com.utest.choucair.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Devices implements Task {


    public static Devices next() {

       return Tasks.instrumented(Devices.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(DevicesPage.BUTTON_LAST_STEP));

    }
}

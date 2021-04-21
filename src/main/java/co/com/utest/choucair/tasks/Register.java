package co.com.utest.choucair.tasks;

import co.com.utest.choucair.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Register implements Task {
    public static Register OnThePage() {

        return Tasks.instrumented(Register.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.JOIN_BUTTON));

    }
}

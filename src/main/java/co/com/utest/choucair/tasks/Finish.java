package co.com.utest.choucair.tasks;

import co.com.utest.choucair.userinterface.FinishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Finish implements Task {

    private String strPassword;

    public Finish(String strPassword) {
        this.strPassword = strPassword;
    }

    public static Finish theForm(String strPassword) {

        return Tasks.instrumented(Finish.class,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(strPassword).into(FinishPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(FinishPage.INPUT_CONFIRM_PASSWORD),
                Click.on(FinishPage.CHECK_UTEST_TERMS),
                Click.on(FinishPage.CHECK_UTEST_TERMS2));

    }
}

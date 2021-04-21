package co.com.utest.choucair.questions;

import co.com.utest.choucair.userinterface.FinishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Answer implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return FinishPage.BUTTON_COMPLETE_SETUP.resolveFor(actor).isVisible();
    }

    public static Answer Validation()
    {
        return new Answer();

    }


}

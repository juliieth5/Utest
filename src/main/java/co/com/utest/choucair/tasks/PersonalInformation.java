package co.com.utest.choucair.tasks;

import co.com.utest.choucair.userinterface.PersonalInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class PersonalInformation implements Task {

    private  String strName;
    private  String strLastName;
    private  String strEmail;
    private  String strBirthMonth;
    private  String strBirthDay;
    private  String strBirthYear;

    public PersonalInformation(String strName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear)
    {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
    }

    public static PersonalInformation theForm(String strName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear)
    {
        return Tasks.instrumented(PersonalInformation.class,strName,strLastName,strEmail,strBirthMonth,strBirthDay,strBirthYear);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strName).into(PersonalInformationPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(PersonalInformationPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(PersonalInformationPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(PersonalInformationPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(PersonalInformationPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(PersonalInformationPage.INPUT_YEAR),
                Click.on(PersonalInformationPage.BUTTON_NEXT_LOCATION)
        );



    }
}

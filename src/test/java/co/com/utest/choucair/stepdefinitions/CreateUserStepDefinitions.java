package co.com.utest.choucair.stepdefinitions;

import co.com.utest.choucair.model.RegisterData;
import co.com.utest.choucair.questions.Answer;
import co.com.utest.choucair.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CreateUserStepDefinitions {

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than leidy Open utest Page and Click Join Button$")
    public void thanleidyOpenutestPageAndClickJoinButton() {
        OnStage.theActorCalled("leidy").wasAbleTo(OpenUp.thePage(), Register.OnThePage());

    }

    @When("^She Fill all register fields$")
    public void sheFillAllRegisterFields(List<RegisterData>registerData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PersonalInformation.theForm(registerData.get(0).getStrName(),registerData.get(0).getStrLastName(),
                registerData.get(0).getStrEmail(),registerData.get(0).getStrBirthMonth(),
                registerData.get(0).getStrBirthDay(),registerData.get(0).getStrBirthYear()),
                Ubication.TheForm(registerData.get(0).getStrCity(),registerData.get(0).getStrPostalCode()),
                Devices.next(),
                Finish.theForm(registerData.get(0).getStrPassword()));


    }

    @Then("^he do click button complete Register$")
    public void heDoClickButtonCompleteRegister() {
OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.Validation()));


    }

}

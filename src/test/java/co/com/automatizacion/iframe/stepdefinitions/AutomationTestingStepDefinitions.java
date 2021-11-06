package co.com.automatizacion.iframe.stepdefinitions;

import co.com.automatizacion.iframe.questions.IframeQuestions;
import co.com.automatizacion.iframe.tasks.Onteract;
import co.com.automatizacion.iframe.tasks.Openpage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutomationTestingStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^this in the demo automationtesting platform$")
    public void this_in_the_demo_automationtesting_platform() {

        theActorCalled("demo").wasAbleTo(
                Openpage.the()
        );
    }


    @When("^you interact with the frames$")
    public void you_interact_with_the_frames() {
        theActorInTheSpotlight().attemptsTo(
                Onteract.iframe()
        );
    }

    @Then("^validate the information within them (.*)$")
    public void validate_the_information_within_them(String questions) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(IframeQuestions.validation(questions))
        );
    }


}

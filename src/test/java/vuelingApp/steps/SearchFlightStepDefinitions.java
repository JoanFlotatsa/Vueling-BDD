package vuelingApp.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
import vuelingApp.questions.Destination;
import vuelingApp.tasks.OpenTheWebPage;
import vuelingApp.tasks.SearchFlight;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchFlightStepDefinitions {

    @Steps
    OpenTheWebPage openVuelingPage;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{word} wants to book a flight")
    public void user_wants_to_book_a_flight(String actor) {

        theActorCalled(actor).wasAbleTo(openVuelingPage);

    }

    @When("He looks for a flight from {word} to {word} on 25 of March")
    public static void he_looks_for_a_flight(String origin, String destination) {

        theActorInTheSpotlight().attemptsTo(SearchFlight.to(origin, destination));

    }

    @Then("Her travel plan destination should be: {word}")
    public static void he_should_see_her_itinerary(String destination) {

        theActorInTheSpotlight().should(seeThat("her destination", Destination.value(), is(equalTo(destination))));

    }

}

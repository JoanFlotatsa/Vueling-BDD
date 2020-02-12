package vuelingApp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import vuelingApp.ui.SearchPage;
import vuelingApp.ui.FlightsPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchFlight implements Performable {

    private final String destination;
    private final String origin;

    protected SearchFlight(String origin, String destination) {
        this.destination = destination;
        this.origin = origin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SearchPage.ORIGIN_INPUT,isClickable()),
                Click.on(SearchPage.ORIGIN_INPUT),
                SendKeys.of(origin)
                        .into(SearchPage.SEARCH_ORIGIN),
                Click.on(SearchPage.ORIGIN_OPTION),
                SendKeys.of(destination)
                        .into(SearchPage.SEARCH_DESTINATION),
                Click.on(SearchPage.DESTINATION_OPTION),
                Click.on(SearchPage.SEARCH_BUTTON),
                WaitUntil.the(FlightsPage.DESTINATION, isVisible())
        );
    }

    public static SearchFlight to(String origin, String destination) {

        return instrumented(SearchFlight.class, origin, destination);

    }
}

package vuelingApp.questions;

import net.serenitybdd.screenplay.Question;
import vuelingApp.ui.FlightsPage;

public class Destination {

    public static Question<String> value() { return actor -> FlightsPage.DESTINATION.resolveFor(actor).getText(); }

}

package vuelingApp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import vuelingApp.ui.AppPage;

public class OpenTheWebPage implements Performable {

    AppPage appPage;

    @Step("Open Vueling webpage")
    public <T extends Actor> void performAs(T actor) {
          actor.attemptsTo(
                  Open.browserOn().the(appPage),
                  WaitUntil.angularRequestsHaveFinished()
          );
    }

}

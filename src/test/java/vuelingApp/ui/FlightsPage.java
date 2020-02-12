package vuelingApp.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightsPage {

        public static Target DESTINATION = Target.the("destination")
            .located(By.xpath("//*[@id='SBSidebarScheduleSelectView_atAGlanceContainer']/div/div[1]/h4"));
}

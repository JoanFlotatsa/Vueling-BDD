package vuelingApp.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPage {

    public static Target SEARCH_BUTTON = Target.the("search")
            .located(By.cssSelector("#btnSubmitHomeSearcher"));
    public static Target DESTINATION_INPUT = Target.the("destination")
            .located(By.cssSelector("#tab-search > div > form > div:nth-child(1) > div.form-input.destination"));
    public static Target ORIGIN_INPUT = Target.the("origin")
            .located(By.cssSelector("#tab-search > div > form > div:nth-child(1) > div.form-input.origin"));
    public static Target DESTINATION_OPTION = Target.the("destination option")
            .located(By.cssSelector("#destinationInput-sugestion-popup > div:nth-child(2) > ul > li.liStation"));
    public static Target ORIGIN_OPTION = Target.the("origin option")
            .located(By.cssSelector("#origin-sugestion-popup > div:nth-child(2) > ul > li.liStation"));
    public static Target SEARCH_ORIGIN = Target.the("search origin")
            .located(By.xpath("//*[@id='tab-search']/div/form/div[1]/div[1]/div[1]/input"));
    public static Target SEARCH_DESTINATION = Target.the("search destination")
            .located(By.xpath("//*[@id='tab-search']/div/form/div[1]/div[2]/div[1]/input"));
}


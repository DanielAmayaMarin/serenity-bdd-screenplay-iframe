package co.com.automatizacion.iframe.userinterfece;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Iframe {

    public static final Target IFRAME = Target.the("iframe").located(By.id("singleframe"));

    public static final Target INPUD = Target.the("ipud").located(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]"));

    public static final Target TITLE = Target.the("title").located(By.xpath("//h1[contains(text(),'Automation Demo Site')]"));
}

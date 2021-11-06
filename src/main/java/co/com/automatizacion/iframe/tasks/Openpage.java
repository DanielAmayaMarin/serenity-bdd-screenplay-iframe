package co.com.automatizacion.iframe.tasks;

import co.com.automatizacion.iframe.userinterfece.UrlPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Openpage implements Task {

    private UrlPage urlPage;

    public static Openpage the() {
        return Tasks.instrumented(Openpage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.browserOn(urlPage)
        );
    }
}

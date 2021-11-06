package co.com.automatizacion.iframe.tasks;

import co.com.automatizacion.iframe.interactions.SwichTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.automatizacion.iframe.userinterfece.Iframe.*;

public class Onteract implements Task {



    public static Onteract iframe() {
        return Tasks.instrumented(Onteract.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwichTo.iframe(IFRAME),
                Enter.theValue("prueba").into(INPUD),
                SwichTo.iframeDefault()
        );
    }
}

package co.com.automatizacion.iframe.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.automatizacion.iframe.userinterfece.Iframe.TITLE;

public class IframeQuestions implements Question<Boolean> {

    private String questions;

    public IframeQuestions(String questions) {
        this.questions = questions;
    }

    public static IframeQuestions validation(String questions) {
        return new IframeQuestions(questions);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String inpudvalue = Text.of(TITLE).viewedBy(actor).asString();
        System.out.println(inpudvalue);
        return questions.equals(inpudvalue);
    }
}

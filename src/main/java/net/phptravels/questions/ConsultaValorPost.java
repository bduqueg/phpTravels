package net.phptravels.questions;

import net.phptravels.userinterface.AddPostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ConsultaValorPost implements Question<Boolean> {

    private String estadoEsperado;

    ConsultaValorPost(String estadoEsperado) {
        this.estadoEsperado = estadoEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String valorPost = Text.of(AddPostPage.VALUE_POST).viewedBy(actor).asString();
        if (estadoEsperado.equals(valorPost)) {
            result = true;

        } else {
            result = false;
        }
        return result;
    }
}

package net.phptravels.questions;

import net.phptravels.userinterface.AddPostPage;
import net.phptravels.util.Utilitarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

public class ConsultaValorPost implements Question<Boolean> {

    private static final Logger logger = Logger.getLogger(ConsultaValorPost.class.getName());
    private String estadoEsperado;

    ConsultaValorPost(String estadoEsperado) {
        this.estadoEsperado = estadoEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String s = Utilitarios.generarAviso("Validando que haya quedado guardado con exito el post ");
        logger.info(s);

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

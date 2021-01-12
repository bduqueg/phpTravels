package net.phptravels.questions;

import net.phptravels.tasks.CrearCategoria;
import net.phptravels.userinterface.BlogCategoriesPage;
import net.phptravels.util.Utilitarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

public class ConsultaValorCategoria implements Question<Boolean> {

    private static final Logger logger = Logger.getLogger(ConsultaValorCategoria.class.getName());
    private String estadoEsperado;

    ConsultaValorCategoria(String estadoEsperado) {
        this.estadoEsperado = estadoEsperado;
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        String s = Utilitarios.generarAviso("Validando que haya quedado guardado con exito la categoría ");
        logger.info(s);

        boolean result;
        String valorCategoria = Text.of(BlogCategoriesPage.VALUE_CATEGORY).viewedBy(actor).asString();
        if (estadoEsperado.equals(valorCategoria)) {
            result = true;

        } else {
            result = false;
        }
        return result;
    }
}

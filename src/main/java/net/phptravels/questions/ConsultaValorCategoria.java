package net.phptravels.questions;

import net.phptravels.userinterface.BlogCategoriesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ConsultaValorCategoria implements Question<Boolean> {

    private String estadoEsperado;

    ConsultaValorCategoria(String estadoEsperado) {
        this.estadoEsperado = estadoEsperado;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
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

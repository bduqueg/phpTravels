package net.phptravels.tasks;

import net.phptravels.userinterface.AddPostPage;
import net.phptravels.userinterface.BlogCategoriesPage;
import net.phptravels.userinterface.MenuPage;
import net.phptravels.util.Constantes;
import net.phptravels.util.Utilitarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CrearPostBlog implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MenuPage.ETIQUETA_BLOG),
                Click.on(MenuPage.ETIQUETA_POST)
        );
        Utilitarios.esperaExplicita(3000L);
        actor.attemptsTo(
                Click.on(BlogCategoriesPage.BUTTON_ADD)
        );
        actor.attemptsTo(
                Enter.theValue(Constantes.TEXTO_NAMEPOST).into(AddPostPage.INPUT_POST_TITLE),
                Enter.theValue(Constantes.URL_PERMALINK).into(AddPostPage.INPUT_PERMALINK)
        );
        Utilitarios.esperaExplicita(3000L);
        actor.attemptsTo(
                Click.on(AddPostPage.BUTTON_SOURCE),
                Enter.theValue(Constantes.TEXTO_PARRAFO).into(AddPostPage.INPUT_PARRAFO)
        );
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(Constantes.CATEGORYNAME).from(AddPostPage.SELECT_CATEGORY),
                Click.on(AddPostPage.INPUT_RELATED_POST),
                Click.on(AddPostPage.SELECT_RELATED_POST)
        );
        actor.attemptsTo(
                Enter.theValue(Constantes.TEXTO_KEY).into(AddPostPage.INPUT_KEYWORDS),
                Enter.theValue(Constantes.TEXTO_DESCRIP).into(AddPostPage.INPUT_DESCRIPTION),
                Click.on(AddPostPage.BUTTON_SUBMIT)
        );
        Utilitarios.esperaExplicita(10000L);
        actor.attemptsTo(
                Click.on(AddPostPage.BUTTON_SEARCH_POST),
                Enter.theValue(Constantes.TEXTO_NAMEPOST).into(AddPostPage.INPUT_SEARCH_POST),
                Click.on(AddPostPage.BUTTON_GO_SEARCH_POST)
        );

    }
}

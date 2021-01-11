package net.phptravels.tasks;

import net.phptravels.userinterface.BlogCategoriesPage;
import net.phptravels.userinterface.MenuPage;
import net.phptravels.util.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CrearCategoria implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuPage.ETIQUETA_BLOG),
                Click.on(MenuPage.ETIQUETA_BLOG_CATEGORIES)
        );
        actor.attemptsTo(
                Click.on(BlogCategoriesPage.BUTTON_ADD)
        );
        actor.attemptsTo(
                Enter.theValue(Constantes.CATEGORYNAME).into(BlogCategoriesPage.INPUT_CATEGORY_NAME),
                Enter.theValue(Constantes.TRADUCCIONVIET).into(BlogCategoriesPage.INPUT_NAME_VIET),
                Enter.theValue(Constantes.TRADUCCIONRUSSIAN).into(BlogCategoriesPage.INPUT_NAME_RUSS),
                Enter.theValue(Constantes.TRADUCCIONARABIC).into(BlogCategoriesPage.INPUT_NAME_ARA),
                Enter.theValue(Constantes.TRADUCCIONFARSI).into(BlogCategoriesPage.INPUT_NAME_FARSI),
                Enter.theValue(Constantes.TRADUCCIONTURKISH).into(BlogCategoriesPage.INPUT_NAME_TURK),
                Enter.theValue(Constantes.TRADUCCIONFRENCH).into(BlogCategoriesPage.INPUT_NAME_FRENCH),
                Enter.theValue(Constantes.TRADUCCIONSPANISH).into(BlogCategoriesPage.INPUT_NAME_SPA),
                Enter.theValue(Constantes.TRADUCCIONGERMAN).into(BlogCategoriesPage.INPUT_NAME_GERM)
        );
        actor.attemptsTo(
                Click.on(BlogCategoriesPage.BUTTON_ADD_FORM)
        );
        actor.attemptsTo(
                Click.on(BlogCategoriesPage.BUTTON_SEARCH),
                Enter.theValue(Constantes.CATEGORYNAME).into(BlogCategoriesPage.INPUT_SEARCH),
                Click.on(BlogCategoriesPage.BUTTON_GO)
        );

    }
}

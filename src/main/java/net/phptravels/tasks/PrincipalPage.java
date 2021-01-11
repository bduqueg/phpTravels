package net.phptravels.tasks;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PrincipalPage {

    private PrincipalPage() {

    }

    public static Performable crearCategoriaBlog() {
        return instrumented(CrearCategoria.class);
    }

    public static Performable crearPost() {
        return instrumented(CrearPostBlog.class);
    }
}

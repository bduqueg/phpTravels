package net.phptravels.tasks;

import net.phptravels.util.Constantes;
import net.phptravels.util.Utilitarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import java.util.logging.Logger;

public class AbrirPagina implements Task {

    private static final Logger logger = Logger.getLogger(AbrirPagina.class.getName());
    private final String rutaPagina;

    public AbrirPagina(String rutaPagina) {
        this.rutaPagina = rutaPagina;
    }

    public static AbrirPagina dePhpTravel() {
        return Tasks.instrumented(AbrirPagina.class, Constantes.URL_PHP_TRAVEL);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        String s = Utilitarios.generarAviso("Accediendo a la pagina : ".concat(rutaPagina));
        logger.info(s);
        actor.attemptsTo(Open.url(rutaPagina));
        s = Utilitarios.generarAviso("Pagina Cargada con exito");
        logger.info(s);


    }
}

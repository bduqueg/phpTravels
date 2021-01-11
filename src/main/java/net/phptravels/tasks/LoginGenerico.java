package net.phptravels.tasks;

import net.phptravels.userinterface.LoginPhpTravelPage;
import net.phptravels.util.Utilitarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginGenerico implements Task {

    private final String usuario;
    private final String password;
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginGenerico.class);

    public LoginGenerico(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String s = Utilitarios.generarAviso("Login en el portal web con usuario: ".concat(usuario)
                .concat(" y con password: ").concat(password));
        LOGGER.info(s);
        actor.attemptsTo(
                Enter.theValue(usuario).into(LoginPhpTravelPage.INPUT_USER),
                Enter.theValue(password).into(LoginPhpTravelPage.INPUT_PASSWORD),
                Click.on(LoginPhpTravelPage.BUTTON_LOGIN)
        );
    }
}

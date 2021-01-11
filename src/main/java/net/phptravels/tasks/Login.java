package net.phptravels.tasks;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login {

    private Login() {

    }

    public static LoginGenerico phpTravel(String usuario, String password) {
        return instrumented(LoginGenerico.class, usuario, password);
    }

}

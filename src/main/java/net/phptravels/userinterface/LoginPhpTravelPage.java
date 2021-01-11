package net.phptravels.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPhpTravelPage extends PageObject {

    public static final Target INPUT_USER = Target.the("Input para ingresar usuario")
            .locatedBy("//input[@type='text']");
    public static final Target INPUT_PASSWORD = Target.the("Input para ingresar constraseña")
            .locatedBy("//input[@type='password']");
    public static final Target BUTTON_LOGIN = Target.the("button para iniciar sesion")
            .locatedBy("//button[@type='submit']");
}

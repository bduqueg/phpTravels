package net.phptravels.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage extends PageObject {

    public static final Target ETIQUETA_BLOG = Target.the("etiqueta para selecciona apartado de blog")
            .locatedBy("//body/div[3]/nav[1]/div[2]/ul[1]/li[14]/a[1]");
    public static final Target ETIQUETA_BLOG_CATEGORIES = Target.the("etiqueta para selecciona apartado de categorias de blog")
            .locatedBy("//a[contains(.,'Blog Categories')]");
    public static final Target ETIQUETA_POST = Target.the("etiqueta para selecciona apartado de post")
            .locatedBy("//a[contains(.,'Posts')]");

}

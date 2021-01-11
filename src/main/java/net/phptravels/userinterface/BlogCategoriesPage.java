package net.phptravels.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BlogCategoriesPage extends PageObject {

    public static final Target BUTTON_ADD = Target.the("boton para agregar nueva categoria")
            .locatedBy("//button[contains(.,' Add')]");
    public static final Target INPUT_CATEGORY_NAME = Target.the("input para ingresar nombre de la categoria nueva")
            .locatedBy("//*[@id='ADD_BLOG_CAT']/div[2]/div/form/div[2]/div[1]/div/input");
    public static final Target INPUT_NAME_VIET = Target.the("input para ingresar nombre en viet")
            .locatedBy("//*[@id='ADD_BLOG_CAT']/div[2]/div/form/div[2]/div[3]/div/input");
    public static final Target INPUT_NAME_RUSS = Target.the("input para ingresar nombre en russian")
            .locatedBy("//*[@id='ADD_BLOG_CAT']/div[2]/div/form/div[2]/div[4]/div/input");
    public static final Target INPUT_NAME_ARA = Target.the("input para ingresar nombre en arabe")
            .locatedBy("//*[@id='ADD_BLOG_CAT']/div[2]/div/form/div[2]/div[5]/div/input");
    public static final Target INPUT_NAME_FARSI = Target.the("input para ingresar nombre en farsi")
            .locatedBy("//*[@id='ADD_BLOG_CAT']/div[2]/div/form/div[2]/div[6]/div/input");
    public static final Target INPUT_NAME_TURK = Target.the("input para ingresar nombre en turques")
            .locatedBy("//*[@id='ADD_BLOG_CAT']/div[2]/div/form/div[2]/div[7]/div/input");
    public static final Target INPUT_NAME_FRENCH = Target.the("input para ingresar nombre en frances")
            .locatedBy("//*[@id='ADD_BLOG_CAT']/div[2]/div/form/div[2]/div[8]/div/input");
    public static final Target INPUT_NAME_SPA = Target.the("input para ingresar nombre en español")
            .locatedBy("//*[@id='ADD_BLOG_CAT']/div[2]/div/form/div[2]/div[9]/div/input");
    public static final Target INPUT_NAME_GERM = Target.the("input para ingresar nombre en aleman")
            .locatedBy("//*[@id='ADD_BLOG_CAT']/div[2]/div/form/div[2]/div[10]/div/input");
    public static final Target BUTTON_ADD_FORM = Target.the("boton para agregar nueva categoria")
            .locatedBy("//*[@id='ADD_BLOG_CAT']/div[2]/div/form/div[3]/button[2]");
    public static final Target VALUE_CATEGORY = Target.the("valor del campo de la nueva categoria")
            .locatedBy("//*[@id='content']/div[2]/div[2]/div[2]/div/div[1]/div[2]/table/tbody/tr/td[3]");
    public static final Target BUTTON_SEARCH = Target.the("boton buscar categoria")
            .locatedBy("//*[@id='content']/div[2]/div[2]/div[2]/div/div[1]/div[3]/a");
    public static final Target INPUT_SEARCH = Target.the("input buscar categoria")
            .locatedBy("//*[@id='content']/div[2]/div[2]/div[2]/div/div[1]/div[3]/span[1]/input");
    public static final Target BUTTON_GO = Target.the("boton buscar categoria GO")
            .locatedBy("//*[@id='content']/div[2]/div[2]/div[2]/div/div[1]/div[3]/span[1]/span/a");
}

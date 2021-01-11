package net.phptravels.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AddPostPage extends PageObject {

    public static final Target INPUT_POST_TITLE = Target.the("etiqueta para nombre del post")
            .locatedBy("//*[@id='GENERAL']/div[1]/div[1]/div/input");
    public static final Target INPUT_PERMALINK = Target.the("etiqueta para permalink")
            .locatedBy("//*[@id='GENERAL']/div[1]/div[2]/div/input");
    public static final Target SELECT_CATEGORY = Target.the("select para seleccionar categoria")
            .locatedBy("//select[@name='category']");
    public static final Target SELECT_OPTION_CATEGORY = Target.the("select para opcion categoria")
            .locatedBy("//*[@id='content']/form/div[2]/div/div/div[2]/div[2]/div/select/option[6]");
    public static final Target INPUT_RELATED_POST = Target.the("input related post")
            .locatedBy("//*[@id='s2id_autogen1']/ul");
    public static final Target SELECT_ = Target.the("input related post")
            .locatedBy("//select[@name='category' and contains(.,'Adventure')]");
    public static final Target SELECT_RELATED_POST = Target.the("select related post")
            .locatedBy("//*[@id='select2-drop']/ul/li[1]/div");
    public static final Target INPUT_KEYWORDS = Target.the("input para palabras clave")
            .locatedBy("//*[@id='GENERAL']/div[3]/div/div/div[2]/div[1]/div/input");
    public static final Target INPUT_DESCRIPTION = Target.the("input para la descipción")
            .locatedBy("//*[@id='GENERAL']/div[3]/div/div/div[2]/div[2]/div/input");
    public static final Target BUTTON_SUBMIT = Target.the("select related post")
            .locatedBy("//button[text()='Submit']");
    public static final Target BUTTON_SOURCE = Target.the("button para ingresar en modo source")
            .locatedBy("//a[@id='cke_46']");
    public static final Target INPUT_PARRAFO = Target.the("input para ingresar texto")
            .locatedBy("//div[@id='cke_1_contents']/textarea");
    public static final Target BUTTON_SEARCH_POST = Target.the("boton buscar post")
            .locatedBy("//*[@id='content']/div[2]/div[2]/div/div/div[1]/div[3]/a");
    public static final Target INPUT_SEARCH_POST = Target.the("input buscar post")
            .locatedBy("//*[@id='content']/div[2]/div[2]/div/div/div[1]/div[3]/span[1]/input");
    public static final Target BUTTON_GO_SEARCH_POST = Target.the("boton buscar post")
            .locatedBy("//*[@id='content']/div[2]/div[2]/div/div/div[1]/div[3]/span[1]/span/a[1]");
    public static final Target VALUE_POST = Target.the("valor de busquedad del post")
            .locatedBy("//*[@id='content']/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr/td[4]/a");
}

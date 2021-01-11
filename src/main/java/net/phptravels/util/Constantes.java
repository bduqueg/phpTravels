package net.phptravels.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;


public class Constantes {

    private Constantes() {

    }

    private static final Logger logger = Logger.getLogger(Constantes.class.getName());

    private static final Properties PROPERTIES = loadProperties();
    private static final String RUTA_PROPERTIES = "src/main/resources/properties/general.properties";


    public static final String USUARIO = PROPERTIES.getProperty("user");
    public static final String PASSWORD = PROPERTIES.getProperty("password");

    public static final String URL_PHP_TRAVEL = PROPERTIES.getProperty("urlPhpTravel");
    public static final String URL_PERMALINK = PROPERTIES.getProperty("permalink");

    public static final String CATEGORYNAME = PROPERTIES.getProperty("nameInEnglish");
    public static final String TRADUCCIONVIET = PROPERTIES.getProperty("nameInVietnamese");
    public static final String TRADUCCIONRUSSIAN = PROPERTIES.getProperty("nameInRussian");
    public static final String TRADUCCIONARABIC = PROPERTIES.getProperty("nameInArabic");
    public static final String TRADUCCIONFARSI = PROPERTIES.getProperty("nameInFarsi");
    public static final String TRADUCCIONTURKISH = PROPERTIES.getProperty("nameInTurkish");
    public static final String TRADUCCIONFRENCH = PROPERTIES.getProperty("nameInFrench");
    public static final String TRADUCCIONSPANISH = PROPERTIES.getProperty("nameInSpanish");
    public static final String TRADUCCIONGERMAN = PROPERTIES.getProperty("nameInGerman");

    public static final String TEXTO_PARRAFO = PROPERTIES.getProperty("textoParrafo");
    public static final String TEXTO_NAMEPOST = PROPERTIES.getProperty("postTitle");
    public static final String TEXTO_KEY = PROPERTIES.getProperty("keywordd");
    public static final String TEXTO_DESCRIP = PROPERTIES.getProperty("descript");


    private static Properties loadProperties() {
        Properties properties = new Properties();
        try {
            String s = Utilitarios.generarAviso("Cargando datos del general.properties");
            logger.info(s);
            properties.load(new FileInputStream(RUTA_PROPERTIES));
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
        return properties;
    }
}

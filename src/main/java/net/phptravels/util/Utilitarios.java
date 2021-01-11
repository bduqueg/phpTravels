package net.phptravels.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class Utilitarios {

    private Utilitarios() {

    }

    private static final Logger LOGGER = LoggerFactory.getLogger(Utilitarios.class);
    private static final String AVISO = "\n----------------------------------------------------------------\n%s\n----------------------------------------------------------------";

    public static String generarAviso(String mensaje) {
        return String.format(AVISO, mensaje);
    }

    public static void esperaExplicita(long duracion) {
        try {
            String s = generarAviso("se pausa la ejecución del programa por " + (duracion / 1000L) + "s");
            LOGGER.info(s);
            Thread.sleep(duracion);
        } catch (InterruptedException e) {
            LOGGER.info(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

    public static String getRutaImagen() {
        String path = "";
        String rutaDocumento = "\\src\\test\\resources\\tecnologia.jpg";
        try {
            path = new File(".").getCanonicalPath();
        } catch (IOException e) {
            String s = Utilitarios.generarAviso("Error en obtener la ruta del archivo\n" + e.getMessage());
            LOGGER.info(s);
        }
        return path + rutaDocumento;
    }

}

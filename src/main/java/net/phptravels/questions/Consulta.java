package net.phptravels.questions;

public class Consulta {

    private Consulta() {

    }

    public static ConsultaValorCategoria valorCategoria(String estadoEsperado) {
        return new ConsultaValorCategoria(estadoEsperado);
    }

    public static ConsultaValorPost valorPost(String estadoEsperado){
        return new ConsultaValorPost(estadoEsperado);
    }
}

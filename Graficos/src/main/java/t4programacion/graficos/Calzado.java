package t4programacion.graficos;

import lombok.Getter;

@Getter
public class Calzado {

    private String tipo_calzado;
    private int talla;
    private double presio;

    public Calzado(String tipo_calzado, int talla, double presio) {
        this.tipo_calzado = tipo_calzado;
        this.talla = talla;
        this.presio = presio;
    }

}

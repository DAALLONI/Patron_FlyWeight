package sinflyweight;

public class GunterCompleto {

    private String tipo;
    private String sonido;

    private int x;
    private int y;

    public GunterCompleto(String tipo, int x, int y) {

        this.tipo = tipo;
        this.sonido = "Wenk";

        this.x = x;
        this.y = y;
    }

    public void hacerSonido() {

        System.out.println(
            "Gunter " + tipo +
            " en posición (" + x + ", " + y + ")" +
            " hace: " + sonido
        );
    }
}

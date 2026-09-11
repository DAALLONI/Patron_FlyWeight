package flyweight;

public class Gunter {

    private String tipo;
    private String sonido;

    public Gunter(String tipo) {
        this.tipo = tipo;
        this.sonido = "Wenk";
    }

    public void hacerSonido(int x, int y) {
        System.out.println(
            "Gunter " + tipo +
            " en posición (" + x + ", " + y + ")" +
            " hace: " + sonido
        );
    }

    public String getTipo() {
        return tipo;
    }

    public String getSonido() {
        return sonido;
    }
}

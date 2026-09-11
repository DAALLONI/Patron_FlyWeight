package flyweight;

public class PosicionGunter {

    private int x;
    private int y;
    private Gunter gunter;

    public PosicionGunter(int x, int y, Gunter gunter) {
        this.x = x;
        this.y = y;
        this.gunter = gunter;
    }

    public void activar() {
        gunter.hacerSonido(x, y);
    }
}

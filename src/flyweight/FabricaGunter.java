package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaGunter {

    private Map<String, Gunter> pool = new HashMap<>();

    private int cantidadCreados = 0;

    public Gunter obtenerGunter(String tipo) {

        Gunter gunter = pool.get(tipo);

        if (gunter == null) {

            gunter = new Gunter(tipo);

            pool.put(tipo, gunter);

            cantidadCreados++;
        }

        return gunter;
    }

    public int getCantidadCreados() {
        return cantidadCreados;
    }
}

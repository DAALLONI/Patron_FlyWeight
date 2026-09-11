package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import util.MemoryDisplay;

public class MainFlyweight {

    private static final int CANTIDAD_GUNTERS = 100000;

    public static void main(String[] args) {

        System.out.println("===== VERSION FLYWEIGHT =====");

        // Medición antes de crear el ejército
        long memoriaAntes = MemoryDisplay.memoriaUsadaBytes();

        FabricaGunter fabrica = new FabricaGunter();

        List<PosicionGunter> ejercito = new ArrayList<>();

        Random random = new Random(42);

        for (int i = 0; i < CANTIDAD_GUNTERS; i++) {

            int x = random.nextInt(10000);
            int y = random.nextInt(10000);

            String tipo;

            if (i % 2 == 0) {
                tipo = "Normal";
            } else {
                tipo = "Con sombrero";
            }

            Gunter gunter = fabrica.obtenerGunter(tipo);

            PosicionGunter posicion =
                    new PosicionGunter(x, y, gunter);

            ejercito.add(posicion);
        }

        // Medición después de crear el ejército
        long memoriaDespues = MemoryDisplay.memoriaUsadaBytes();

        long memoriaUsada = memoriaDespues - memoriaAntes;

        System.out.println(
            "Cantidad de PosicionGunter: " +
            ejercito.size()
        );

        System.out.println(
            "Cantidad de objetos Gunter creados: " +
            fabrica.getCantidadCreados()
        );

        System.out.println(
            "Memoria antes: " +
            memoriaAntes / (1024.0 * 1024.0) +
            " MB"
        );

        System.out.println(
            "Memoria después: " +
            memoriaDespues / (1024.0 * 1024.0) +
            " MB"
        );

        System.out.println(
            "Memoria utilizada: " +
            memoriaUsada / (1024.0 * 1024.0) +
            " MB"
        );
      
        for (int i = 0; i < 5; i++) {
            ejercito.get(i).activar();
        }
    }
}

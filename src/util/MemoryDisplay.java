package util;

public class MemoryDisplay {

    public static long memoriaUsadaBytes() {

        Runtime runtime = Runtime.getRuntime();

        System.gc();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static double memoriaUsadaMB() {
        return memoriaUsadaBytes() / (1024.0 * 1024.0);
    }
}

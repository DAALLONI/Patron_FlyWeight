public class MemoryDisplay {
    public static long memoriaUsadaMB() {
        Runtime runtime = Runtime.getRuntime();
        System.gc();         
        try { Thread.sleep(100); } catch (InterruptedException ignored) {}
        long usada = runtime.totalMemory() - runtime.freeMemory();
        return usada / (1024 * 1024); // convertir bytes a MB
    }
}
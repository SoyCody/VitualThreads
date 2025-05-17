import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ejemplo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                System.out.println("🧚 Tarea " + finalI + " con hilo: " + Thread.currentThread());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
    }
}

/* Dado un listado de URLs (links a páginas Web), se necesita visitar cada una de ellas para encontrar y contar cuantas otras URLs internas tiene la página Web, para finalmente almacenar en un nuevo archivo los resultados obtenidos. En el nuevo archivo se necesita almacenar al URL y la cantidad de URLs internas que esta tiene.*/

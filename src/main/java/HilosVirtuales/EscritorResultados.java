package HilosVirtuales;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscritorResultados {
    public static void escribir(String url, int cantidad) {
        try {
            // Ruta absoluta a la carpeta src del proyecto
            Path rutaSrc = Paths.get("src").toAbsolutePath();
            Path archivo = rutaSrc.resolve("resultados.txt");

            try (FileWriter fw = new FileWriter(archivo.toFile(), true)) {
                fw.write(url + " -> " + cantidad + " enlaces internos\n");
            }
        } catch (IOException e) {
            System.out.println("Error escribiendo resultados: " + e.getMessage());
        }
    }
}

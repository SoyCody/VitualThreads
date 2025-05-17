package Contador;

import java.io.FileWriter;
import java.io.IOException;

public class EscritorResultados {
    public static synchronized void guardar(String url, int cantidad) {
        try (FileWriter fw = new FileWriter("resultados.txt", true)) {
            fw.write(url + " -> " + cantidad + " URLs internas\n");
        } catch (IOException e) {
            System.out.println("Error escribiendo resultados: " + e.getMessage());
        }
    }
}

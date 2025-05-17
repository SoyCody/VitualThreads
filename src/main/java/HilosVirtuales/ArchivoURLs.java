package HilosVirtuales;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoURLs {
    public static List<String> leer(String txt) {
        List<String> urls = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(txt))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                urls.add(linea.trim());
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }
        return urls;
    }
}

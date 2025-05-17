package Contador;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> urls = ArchivoURLs.leer("urls.txt");

        for (String url : urls) {
            Thread hilo = new Thread(new ProcesadorURL(url));
            hilo.start();
        }

        System.out.println("Procesamiento iniciado.");
    }
}

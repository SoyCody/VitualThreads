package HilosVirtuales;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> urls = ArchivoURLs.leer("urls.txt");

        for (String url : urls) {
            Thread.startVirtualThread(new ProcesadorURL(url));
        }

        System.out.println("Procesamiento con hilos virtuales iniciado.");
    }
}
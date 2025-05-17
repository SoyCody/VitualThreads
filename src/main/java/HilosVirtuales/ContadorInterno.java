package HilosVirtuales;

import java.io.*;
import java.net.*;
import java.util.regex.*;

public class ContadorInterno {
    public static int contar(String urlBase) {
        int contador = 0;
        try {
            URL url = new URL(urlBase);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            StringBuilder contenido = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                contenido.append(inputLine);
            }
            in.close();

            // Expresión corregida
            Pattern pattern = Pattern.compile("href=[\\\"'](.*?)[\\\"']");
            Matcher matcher = pattern.matcher(contenido.toString());

            while (matcher.find()) {
                String enlace = matcher.group(1);
                if (enlace.startsWith(urlBase)) {
                    contador++;
                }
            }

        } catch (IOException e) {
            System.out.println("No se pudo acceder a " + urlBase + ": " + e.getMessage());
        }
        return contador;
    }
}

package Contador;

public class ProcesadorURL implements Runnable {
    private String url;

    public ProcesadorURL(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        int cantidad = ContadorInterno.contar(url);
        EscritorResultados.guardar(url, cantidad);
    }
}

package HilosVirtuales;

public class ProcesadorURL implements Runnable {
    private final String url;

    public ProcesadorURL(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        int cantidad = ContadorInterno.contar(url);
        EscritorResultados.escribir(url, cantidad);
    }
}

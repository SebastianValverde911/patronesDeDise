public class ComputadoraApple implements Computadora {

    private final SistemaOperativo so;

    ComputadoraApple(SistemaOperativo so) {
        this.so = so;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Computadora de Apple con sistema operativo "+so.getNombre());
    }
}

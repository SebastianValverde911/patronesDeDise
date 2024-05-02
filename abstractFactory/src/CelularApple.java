public class CelularApple implements Celular {
    private final SistemaOperativo so;

    public CelularApple(SistemaOperativo so) {
        this.so = so;
    }

    public void mostrarInfo() {
        System.out.println("Celular de Apple con sistema operativo "+so.getNombre());
    }
}

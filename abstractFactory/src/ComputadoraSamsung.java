public class ComputadoraSamsung implements  Computadora{

    private final SistemaOperativo so;

    ComputadoraSamsung(SistemaOperativo so) {
        this.so = so;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Computadora de Samsung con sistema operativo " + so.getNombre());
    }
}

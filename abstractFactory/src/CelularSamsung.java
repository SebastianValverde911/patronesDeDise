public class CelularSamsung implements  Celular {
    private final SistemaOperativo so;
    CelularSamsung(SistemaOperativo so){
        this.so = so;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Celular de Samsung con sistema operativo " + so.getNombre());
    }
}

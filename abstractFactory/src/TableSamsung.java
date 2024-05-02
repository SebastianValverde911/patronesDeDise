public class TableSamsung implements  Table{
    private final SistemaOperativo so;

    TableSamsung(SistemaOperativo so) {
        this.so = so;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Table de Samsung con sistema operativo "+so.getNombre());
    }
}

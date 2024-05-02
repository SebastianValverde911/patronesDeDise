public class TableApple implements Table {

    private final SistemaOperativo so;

    TableApple(SistemaOperativo so) {
        this.so = so;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Table de Apple con sistema operativo " + so.getNombre());
    }
}

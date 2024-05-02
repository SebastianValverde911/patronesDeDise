public interface FabricaTecnologia {
    Celular createPhone(SistemaOperativo so);
    Table createTablet(SistemaOperativo so);
    Computadora createLaptop(SistemaOperativo so);
}

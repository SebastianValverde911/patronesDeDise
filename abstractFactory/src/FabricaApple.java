public class FabricaApple implements  FabricaTecnologia {

    public Celular createPhone(SistemaOperativo so) {
        return new CelularApple(so);
    }


    public Table createTablet(SistemaOperativo so) {
        return new TableApple(so);
    }


    public Computadora createLaptop(SistemaOperativo so) {
        return new ComputadoraApple(so);
    }
}

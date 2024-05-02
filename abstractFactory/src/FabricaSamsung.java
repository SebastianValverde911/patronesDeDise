public class FabricaSamsung implements FabricaTecnologia {
    @Override
    public Celular createPhone(SistemaOperativo so) {
        return new CelularSamsung(so);
    }

    @Override
    public Table createTablet(SistemaOperativo so) {
        return new TableSamsung(so);
    }

    @Override
    public Computadora createLaptop(SistemaOperativo so) {
        return new ComputadoraSamsung(so);
    }
}

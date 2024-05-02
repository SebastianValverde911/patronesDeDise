public class Main {
    public static void main(String[] args) {

        FabricaTecnologia fabrica = new FabricaApple();

        Celular cel = fabrica.createPhone(new Ios());
        Table table = fabrica.createTablet(new Ios());
        Computadora compu = fabrica.createLaptop(new Ios());

        System.out.println("***************************************************************************\n");

        cel.mostrarInfo();
        table.mostrarInfo();
        compu.mostrarInfo();

        System.out.println("***************************************************************************\n");


        FabricaTecnologia fabricaSamsung = new FabricaSamsung();

        Celular celSam = fabricaSamsung.createPhone(new Samsung());
        Table tableSam = fabricaSamsung.createTablet(new Samsung());
        Computadora compuSam = fabricaSamsung.createLaptop(new Windows());

        celSam.mostrarInfo();
        tableSam.mostrarInfo();
        compuSam.mostrarInfo();
    }
}
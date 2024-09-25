public class OrdenadorA extends Ordenador {
    @Override
    public String getTipoRAM(){
        return "8 GB DDR4";
    }
    @Override
    public int getCapacidadRAM(){
        return 8;
    }
    @Override
    public String getTipodiscoduro(){
        return "SSD";
    }
    @Override
    public int getCapacidaddisco(){
        return 256;
    }
    @Override
    public int getDimensionespantalla(){
        return 14;
    }
    @Override
    public String getCalidadpantalla(){
        return "Resolución Full HD (1920 x 1080)";
    }
}

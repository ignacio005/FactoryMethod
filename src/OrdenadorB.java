public class OrdenadorB extends Ordenador{
    @Override
    public String getTipoRAM(){
        return "16 GB DDR4";
    }
    @Override
    public int getCapacidadRAM(){
        return 16;
    }
    @Override
    public String getTipodiscoduro(){
        return "SSD";
    }
    @Override
    public int getCapacidaddisco(){
        return 512;
    }
    @Override
    public int getDimensionespantalla(){
        return 16;
    }
    @Override
    public String getCalidadpantalla(){
        return "Resolución 2K (2560 x 1440)";
    }
}

public class OrdenadorC extends Ordenador{
    @Override
    public String getTipoRAM(){
        return "32 GB DDR5";
    }
    @Override
    public int getCapacidadRAM(){
        return 32;
    }
    @Override
    public String getTipodiscoduro(){
        return "HDD";
    }
    @Override
    public int getCapacidaddisco(){
        return 1000;
    }
    @Override
    public int getDimensionespantalla(){
        return 17;
    }
    @Override
    public String getCalidadpantalla(){
        return "Resolución 4K UHD (3840 x 2160)";
    }
}

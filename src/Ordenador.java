abstract class Ordenador {
    private String gigabyte = " GB";
    private String pulgada = " pulgadas";
    public abstract String getTipoRAM();
    public abstract int getCapacidadRAM();
    public abstract String getTipodiscoduro();
    public abstract int getCapacidaddisco();
    public abstract int getDimensionespantalla();
    public abstract String getCalidadpantalla();
    @Override
    public String toString() {
        return "Tipo de RAM: " + this.getTipoRAM() + "\nCapacidad de RAM: " + getCapacidadRAM() + gigabyte + "\nTipo de disco duro: " + getTipodiscoduro() + "\nCapacidad de disco duro: " + getCapacidaddisco() + gigabyte + "\nDimensiones de pantalla: " + getDimensionespantalla() + pulgada + "\nCalidad de pantalla: " + getCalidadpantalla() + "\n";
    }
}

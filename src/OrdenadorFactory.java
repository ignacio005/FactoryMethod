public class OrdenadorFactory implements OrdenadorFactoryMethod {
    @Override
    public Ordenador createOrdenador(String tipo){
        switch (tipo){
            case "A":
                return new OrdenadorA();
            case "B":
                return new OrdenadorB();
            case "C":
                return new OrdenadorC();
            default:
                throw new IllegalArgumentException("Tipo de ordenador no válido: " + tipo);
        }
    }
}

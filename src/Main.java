public class Main {
    public static void main(String[] args) {
        OrdenadorFactoryMethod fabrica = new OrdenadorFactory();
        Ordenador ordenador1 = fabrica.createOrdenador("A");
        Ordenador ordenador2 = fabrica.createOrdenador("B");
        Ordenador ordenador3 = fabrica.createOrdenador("C");
        System.out.println("Ordenador 1:\n" + ordenador1.toString());
        System.out.println("Ordenador 2:\n" + ordenador2.toString());
        System.out.println("Ordenador 3:\n" + ordenador3.toString());
    }
}
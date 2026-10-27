public class Efectivo implements Pagos{

    @Override 
    public void procesar(double m) {
        System.out.printf("Efectivo: L %.2f%n", m);
    }

}



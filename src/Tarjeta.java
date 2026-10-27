import java.util.ArrayList;

public class Tarjeta implements Pagos, Historial{
    private ArrayList<Double> pagos = new ArrayList<>();

    @Override
    public void procesar(double monto) {
        pagos.add(monto);
        System.out.printf("Pago con tarjeta de L %.2f%n", monto);
    }

    @Override
    public void recibo(double monto) {
        Pagos.super.recibo(monto);
    }

    @Override
    public void imprimirHistorial() {
        System.out.println("Historial de Pagos con Tarjeta");
        for (int i = 0; i < pagos.size(); i++) {
            System.out.printf("L %.2f%n", pagos.get(i));
        }
        
    }
}

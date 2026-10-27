import java.util.ArrayList;

public class Transferencia implements Pagos, Historial{
    private ArrayList<Double> pagos = new ArrayList<>();
    
    @Override
    public void procesar(double monto) {
        pagos.add(monto);
        System.out.printf("Transferencia de L %.2f%n", monto);
    }

    @Override
    public void recibo(double monto) {
        System.out.printf("Comprobante de transferencia: L %.2f%n", monto);
    }

    @Override
    public void imprimirHistorial() {
        System.out.println("Historial de Transferencias");
        for (int i = 0; i < pagos.size(); i++) {
            System.out.printf("L %.2f%n", pagos.get(i));
        }
    }
}

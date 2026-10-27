import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tarjeta tarjeta =  new Tarjeta();
        Transferencia transferencia = new Transferencia();
        Pagos[] metodos = { new Efectivo(), tarjeta, transferencia };
        ArrayList<Historial> historial = new ArrayList<>();
        historial.add(tarjeta);
        historial.add(transferencia);

        int opcion;

        do {
            System.out.println("\nManejo de Pagos");
            System.out.println("1. Efectivo");
            System.out.println("2. Tarjeta");
            System.out.println("3. Transferencia");
            System.out.println("4. Ver historial");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Monto: L ");
                    double monto = sc.nextDouble();
                    if (Pagos.montoValido(monto)) {
                        Pagos p = metodos[opcion - 1];
                        p.procesar(monto);
                        p.recibo(monto);
                    } else {
                        System.out.println("El monto debe ser mayor que 0.");   
                    }
                    break;
                case 4:
                    for (Historial h : historial){
                        h.imprimirHistorial();
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 0);

        System.out.println("Fin del programa.");
        sc.close();
    }

}

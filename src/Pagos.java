public interface Pagos {
    void procesar(double monto);

    default void recibo(double monto){
        System.out.printf("Recibo de L %.2f%n" , monto);
    }
    static boolean montoValido(double monto){
        return monto > 0;
    }

}




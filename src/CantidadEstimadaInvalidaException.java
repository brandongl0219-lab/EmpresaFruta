public class CantidadEstimadaInvalidaException extends Exception {
    public CantidadEstimadaInvalidaException(double cantidad) {
        super("Cantidad estimada inválida: " + cantidad + ". Debe ser entre 0.5 y 200.");
    }
}

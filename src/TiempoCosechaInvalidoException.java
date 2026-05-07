public class TiempoCosechaInvalidoException extends Exception {
    public TiempoCosechaInvalidoException(int tiempo) {
        super("Tiempo de cosecha inválido: " + tiempo + ". Debe ser entre 1 y 6.");
    }
}

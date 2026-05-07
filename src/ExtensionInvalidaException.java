public class ExtensionInvalidaException extends Exception {
    public ExtensionInvalidaException(double extension, double limite) {
        super("Extensión inválida: " + extension + " ha. Debe ser entre 0.5 y " + limite);
    }
}

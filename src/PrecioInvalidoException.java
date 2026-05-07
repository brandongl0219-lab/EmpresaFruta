public class PrecioInvalidoException extends Exception {
    public PrecioInvalidoException(double precio, double costo) {
        super("Precio $" + precio + " inválido. Debe ser entre 5% y 30% más que el costo $" + costo);
    }
}

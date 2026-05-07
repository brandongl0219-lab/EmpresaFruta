import java.util.ArrayList;
import java.util.Objects;

public class Fruta implements Comparable<Fruta>, java.util.Comparator<Fruta> {

    private String nombre;
    private double extensionHectareas;
    private double costoProdPromTonelada;
    private double precioVentaPromTonelada;
    private double limiteExtension;
    private ArrayList<PeriodoCosecha> periodos;

    public Fruta() { this.periodos = new ArrayList<>(); }

    public Fruta(String nombre, double extension, double costo, double precio, double limiteExt)
            throws ExtensionInvalidaException, PrecioInvalidoException {

        if (limiteExt > 10) limiteExt = 10;

        if (extension < 0.5 || extension > limiteExt)
            throw new ExtensionInvalidaException(extension, limiteExt);

        double minPrecio = costo + (costo * 0.05);
        double maxPrecio = costo + (costo * 0.30);
        if (precio < minPrecio || precio > maxPrecio)
            throw new PrecioInvalidoException(precio, costo);

        this.nombre = nombre;
        this.extensionHectareas = extension;
        this.costoProdPromTonelada = costo;
        this.precioVentaPromTonelada = precio;
        this.limiteExtension = limiteExt;
        this.periodos = new ArrayList<>();
    }

    public double getCostoTotal(PeriodoCosecha p) {
        return p.getCantEstimadaPorHectarea() * extensionHectareas * costoProdPromTonelada;
    }

    public double getGananciasEstimadas(PeriodoCosecha p) {
        return (p.getCantEstimadaPorHectarea() * extensionHectareas * precioVentaPromTonelada) - getCostoTotal(p);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(nombre, ((Fruta) o).nombre);
    }

    @Override
    public int hashCode() { return Objects.hash(nombre); }

    @Override
    public int compareTo(Fruta f) { return this.nombre.compareTo(f.nombre); }

    @Override
    public int compare(Fruta f1, Fruta f2) { return Double.compare(f1.extensionHectareas, f2.extensionHectareas); }

    public void agregarPeriodo(PeriodoCosecha p) { periodos.add(p); }
    public boolean eliminarPeriodo(PeriodoCosecha p) { return periodos.remove(p); }
    public String getNombre() { return nombre; }
    public double getExtensionHectareas() { return extensionHectareas; }
    public ArrayList<PeriodoCosecha> getPeriodos() { return periodos; }
}
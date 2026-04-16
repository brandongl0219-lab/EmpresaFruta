import java.util.ArrayList;
import java.util.Objects;
import java.util.Comparator;

public class Fruta implements Comparable<Fruta>, Comparator<Fruta> {
    private String nombre;
    private double extensionHectareas;
    private double costoProdPromTonelada;
    private double precioVentaPromTonelada;
    private ArrayList<PeriodoCosecha> periodos;

    public Fruta() {
        this.periodos = new ArrayList<>();
    }

    public Fruta(String nombre, double extensionHectareas, double costoProdPromTonelada, double precioVentaPromTonelada) {
        this.nombre = nombre;
        this.extensionHectareas = extensionHectareas;
        this.costoProdPromTonelada = costoProdPromTonelada;
        this.precioVentaPromTonelada = precioVentaPromTonelada;
        this.periodos = new ArrayList<>();
    }

    public double getCostoTotal(PeriodoCosecha p) {
        // Costo = Toneladas estimadas por hectárea * total hectáreas * costo por tonelada
        return p.getCantEstimadaPorHectarea() * extensionHectareas * costoProdPromTonelada;
    }

    public double getGananciasEstimadas(PeriodoCosecha p) {
        double ingresos = p.getCantEstimadaPorHectarea() * extensionHectareas * precioVentaPromTonelada;
        return ingresos - getCostoTotal(p);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruta fruta = (Fruta) o;
        return Objects.equals(nombre, fruta.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public int compareTo(Fruta f) {
        return this.nombre.compareTo(f.nombre);
    }

    @Override
    public int compare(Fruta f1, Fruta f2) {
        return Double.compare(f1.extensionHectareas, f2.extensionHectareas);
    }

    public void agregarPeriodo(PeriodoCosecha p) { periodos.add(p); }
    public boolean eliminarPeriodo(PeriodoCosecha p) { return periodos.remove(p); }
    public String getNombre() { return nombre; }
    public double getExtensionHectareas() { return extensionHectareas; }
    public ArrayList<PeriodoCosecha> getPeriodos() { return periodos; }
}
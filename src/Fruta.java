import java.util.ArrayList;

public class Fruta {

    private String nombre;
    private double extensionHectareas;
    private double costoProdPromTonelada;   // costo de producción promedio por tonelada
    private double precioVentaPromTonelada; // precio de venta promedio por tonelada
    private ArrayList<PeriodoCosecha> periodos;


    public Fruta(String nombre, double extensionHectareas,
                 double costoProdPromTonelada, double precioVentaPromTonelada) {
        this.nombre = nombre;
        this.extensionHectareas = extensionHectareas;
        this.costoProdPromTonelada = costoProdPromTonelada;
        this.precioVentaPromTonelada = precioVentaPromTonelada;
        this.periodos = new ArrayList<>();
    }


    public void agregarPeriodo(PeriodoCosecha p) {
        periodos.add(p);
    }


    public boolean eliminarPeriodo(PeriodoCosecha p) {
        return periodos.remove(p);
    }


    public double getCostoTotal(PeriodoCosecha p) {
        return p.getCantEstimadaPorHectarea() * extensionHectareas * costoProdPromTonelada;
    }


    public double getGananciasEstimadas(PeriodoCosecha p) {
        double ingresos = p.getCantEstimadaPorHectarea() * extensionHectareas * precioVentaPromTonelada;
        return ingresos - getCostoTotal(p);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExtensionHectareas() {
        return extensionHectareas;
    }

    public void setExtensionHectareas(double extensionHectareas) {
        this.extensionHectareas = extensionHectareas;
    }

    public double getCostoProdPromTonelada() {
        return costoProdPromTonelada;
    }

    public void setCostoProdPromTonelada(double costoProdPromTonelada) {
        this.costoProdPromTonelada = costoProdPromTonelada;
    }

    public double getPrecioVentaPromTonelada() {
        return precioVentaPromTonelada;
    }

    public void setPrecioVentaPromTonelada(double precioVentaPromTonelada) {
        this.precioVentaPromTonelada = precioVentaPromTonelada;
    }

    public ArrayList<PeriodoCosecha> getPeriodos() {
        return periodos;
    }


    @Override
    public String toString() {
        return "Fruta{" +
                "nombre='" + nombre + '\'' +
                ", extensionHectareas=" + extensionHectareas + " ha" +
                ", costoProdPromTonelada=" + costoProdPromTonelada +
                ", precioVentaPromTonelada=" + precioVentaPromTonelada +
                ", periodos=" + periodos +
                '}';
    }
}
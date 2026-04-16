import java.util.Objects;

public class PeriodoCosecha implements Comparable<PeriodoCosecha> {
    private String nombre;
    private double cantEstimadaPorHectarea;

    public PeriodoCosecha(String nombre, double cantEstimadaPorHectarea) {
        this.nombre = nombre;
        this.cantEstimadaPorHectarea = cantEstimadaPorHectarea;
    }

    @Override
    public int compareTo(PeriodoCosecha p) {
        // Ordenar por cantidad estimada (de mayor a menor producción)
        return Double.compare(p.cantEstimadaPorHectarea, this.cantEstimadaPorHectarea);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeriodoCosecha that = (PeriodoCosecha) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() { return nombre; }
    public double getCantEstimadaPorHectarea() { return cantEstimadaPorHectarea; }
}
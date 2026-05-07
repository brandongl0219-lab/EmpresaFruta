import java.util.Objects;

public class PeriodoCosecha implements Comparable<PeriodoCosecha> {

    private String nombre;
    private int tiempoCosecha;
    private double cantEstimadaPorHectarea;

    public PeriodoCosecha(String nombre, int tiempo, double cantidad)
            throws TiempoCosechaInvalidoException, CantidadEstimadaInvalidaException {

        if (tiempo < 1 || tiempo > 6)
            throw new TiempoCosechaInvalidoException(tiempo);

        if (cantidad < 0.5 || cantidad > 200)
            throw new CantidadEstimadaInvalidaException(cantidad);

        this.nombre = nombre;
        this.tiempoCosecha = tiempo;
        this.cantEstimadaPorHectarea = cantidad;
    }

    @Override
    public int compareTo(PeriodoCosecha p) { return Double.compare(p.cantEstimadaPorHectarea, this.cantEstimadaPorHectarea); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(nombre, ((PeriodoCosecha) o).nombre);
    }

    @Override
    public int hashCode() { return Objects.hash(nombre); }

    public String getNombre() { return nombre; }
    public int getTiempoCosecha() { return tiempoCosecha; }
    public double getCantEstimadaPorHectarea() { return cantEstimadaPorHectarea; }
}
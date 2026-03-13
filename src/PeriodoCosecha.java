public class PeriodoCosecha {

    private String nombre;
    private double cantEstimadaPorHectarea; // toneladas por hectárea

    // Constructor
    public PeriodoCosecha(String nombre, double cantEstimadaPorHectarea) {
        this.nombre = nombre;
        this.cantEstimadaPorHectarea = cantEstimadaPorHectarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantEstimadaPorHectarea() {
        return cantEstimadaPorHectarea;
    }

    public void setCantEstimadaPorHectarea(double cantEstimadaPorHectarea) {
        this.cantEstimadaPorHectarea = cantEstimadaPorHectarea;
    }

    // toString
    @Override
    public String toString() {
        return "PeriodoCosecha{" +
                "nombre='" + nombre + '\'' +
                ", cantEstimadaPorHectarea=" + cantEstimadaPorHectarea + " ton/ha" +
                '}';
    }
}
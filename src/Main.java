import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Fruta fresa = new Fruta("Fresa", 10.0, 500.0, 1200.0);
        Fruta mango = new Fruta("Mango", 15.0, 300.0, 900.0);

        PeriodoCosecha verano = new PeriodoCosecha("Verano", 8.5);
        PeriodoCosecha primavera = new PeriodoCosecha("Primavera", 9.2);

        fresa.agregarPeriodo(verano);
        fresa.agregarPeriodo(primavera);

        System.out.println("=== REPORTE FRUTA: " + fresa.getNombre() + " ===");
        for (PeriodoCosecha p : fresa.getPeriodos()) {
            System.out.printf("Periodo: %-10s | Costo: $%,.2f | Ganancia: $%,.2f%n",
                    p.getNombre(), fresa.getCostoTotal(p), fresa.getGananciasEstimadas(p));
        }

        System.out.println("\n=== PRUEBAS DE INTERFACES (POLIMORFISMO) ===");
        System.out.println("¿Es Fresa igual a Mango?: " + fresa.equals(mango));
        System.out.println("Comparar Fresa vs Mango (Nombre): " + fresa.compareTo(mango));

        Fruta compHectareas = new Fruta();
        System.out.println("Comparar Extension (10ha vs 15ha): " + compHectareas.compare(fresa, mango));
    }
}
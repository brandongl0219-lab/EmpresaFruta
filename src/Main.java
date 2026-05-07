public class Main {
    public static void main(String[] args) {

        try {
            Fruta fresa = new Fruta("Fresa", 5.0, 500.0, 600.0, 10.0);
            PeriodoCosecha verano = new PeriodoCosecha("Verano", 3, 8.5);
            fresa.agregarPeriodo(verano);

            System.out.println("=== REPORTE: " + fresa.getNombre() + " ===");
            for (PeriodoCosecha p : fresa.getPeriodos())
                System.out.printf("Periodo: %-10s | Costo: $%,.2f | Ganancia: $%,.2f%n",
                        p.getNombre(), fresa.getCostoTotal(p), fresa.getGananciasEstimadas(p));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Fruta mango = new Fruta("Mango", 0.1, 300.0, 360.0, 10.0);
        } catch (ExtensionInvalidaException e) {
            System.out.println("Excepción -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Fruta papaya = new Fruta("Papaya", 3.0, 400.0, 410.0, 10.0);
        } catch (PrecioInvalidoException e) {
            System.out.println("Excepción -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            PeriodoCosecha malo = new PeriodoCosecha("Invierno", 8, 10.0);
        } catch (TiempoCosechaInvalidoException e) {
            System.out.println("Excepción -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            PeriodoCosecha malo2 = new PeriodoCosecha("Primavera", 2, 250.0);
        } catch (CantidadEstimadaInvalidaException e) {
            System.out.println("Excepción -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
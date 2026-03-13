public class Main {

    public static void main(String[] args) {
        Fruta fresa = new Fruta("Fresa", 10.0, 500.0, 1200.0);

        PeriodoCosecha verano   = new PeriodoCosecha("Verano",   8.5);  // 8.5 ton/ha
        PeriodoCosecha otonio   = new PeriodoCosecha("Otoño",    6.0);  // 6.0 ton/ha
        PeriodoCosecha primavera = new PeriodoCosecha("Primavera", 9.2); // 9.2 ton/ha

        fresa.agregarPeriodo(verano);
        fresa.agregarPeriodo(otonio);
        fresa.agregarPeriodo(primavera);

        System.out.println("=== " + fresa.getNombre() + " ===");
        System.out.println("Hectáreas : " + fresa.getExtensionHectareas());
        System.out.println("Periodos  : " + fresa.getPeriodos().size());
        System.out.println();

        for (PeriodoCosecha p : fresa.getPeriodos()) {
            double costo     = fresa.getCostoTotal(p);
            double ganancias = fresa.getGananciasEstimadas(p);
            System.out.printf("Periodo: %-12s | Costo total: $%,.2f | Ganancias: $%,.2f%n",
                    p.getNombre(), costo, ganancias);
        }

        System.out.println();

        boolean eliminado = fresa.eliminarPeriodo(otonio);
        System.out.println("Periodo 'Otoño' eliminado: " + eliminado);
        System.out.println("Periodos restantes: " + fresa.getPeriodos().size());
    }
}
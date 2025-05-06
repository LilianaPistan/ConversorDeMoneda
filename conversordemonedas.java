import java.util.Scanner;
public class ConversorDeMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tasas de cambio (puedes actualizarlas o pedirlas dinámicamente)
        double tasaDolar = 0.011;   // 1 peso argentino = 0.011 dólares
        double tasaEuro = 0.010;    // 1 peso argentino = 0.010 euros
        double tasaReal = 0.055;    // 1 peso argentino = 0.055 reales

        System.out.println("=== Conversor de Monedas ===");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Convertir de Pesos a otra moneda");
        System.out.println("2. Convertir de otra moneda a Pesos");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Ingrese la cantidad de pesos:");
            double pesos = scanner.nextDouble();

            System.out.println("¿A qué moneda desea convertir?");
            System.out.println("1. Dólares");
            System.out.println("2. Euros");
            System.out.println("3. Reales");
            int moneda = scanner.nextInt();

            switch (moneda) {
                case 1:
                    System.out.printf("Resultado: %.2f dólares\n", pesos * tasaDolar);
                    break;
                case 2:
                    System.out.printf("Resultado: %.2f euros\n", pesos * tasaEuro);
                    break;
                case 3:
                    System.out.printf("Resultado: %.2f reales\n", pesos * tasaReal);
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } else if (opcion == 2) {
            System.out.println("¿De qué moneda desea convertir?");
            System.out.println("1. Dólares");
            System.out.println("2. Euros");
            System.out.println("3. Reales");
            int moneda = scanner.nextInt();

            System.out.println("Ingrese la cantidad de dinero:");
            double cantidad = scanner.nextDouble();

            switch (moneda) {
                case 1:
                    System.out.printf("Resultado: %.2f pesos\n", cantidad / tasaDolar);
                    break;
                case 2:
                    System.out.printf("Resultado: %.2f pesos\n", cantidad / tasaEuro);
                    break;
                case 3:
                    System.out.printf("Resultado: %.2f pesos\n", cantidad / tasaReal);
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } else {
            System.out.println("Opción inválida");
        }

        scanner.close();
    }
}
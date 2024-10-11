import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double tasaDolarAPesoArgentino = 350.0;
        double tasaPesoArgentinoADolar = 1 / tasaDolarAPesoArgentino;
        double tasaDolarARealBrasileño = 5.0;
        double tasaRealBrasileñoADolar = 1 / tasaDolarARealBrasileño;
        double tasaDolarAPesoColombiano = 4000.0;
        double tasaPesoColombianoADolar = 1 / tasaDolarAPesoColombiano; 

        System.out.println("=====================================");
        System.out.println("    Bienvenido al Conversor de Monedas");
        System.out.println("=====================================");
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Dólar a Peso Argentino");
        System.out.println("2. Peso Argentino a Dólar");
        System.out.println("3. Dólar a Real Brasileño");
        System.out.println("4. Real Brasileño a Dólar");
        System.out.println("5. Dólar a Peso Colombiano");
        System.out.println("6. Peso Colombiano a Dólar");
        System.out.println("=====================================");

        int opcion = scanner.nextInt();

        // Validación de opción
        if (opcion < 1 || opcion > 6) {
            System.out.println("Opción no válida. Por favor seleccione una opción correcta.");
            scanner.close();
            return; // Salir del programa si la opción no es válida
        }

        System.out.print("Ingrese la cantidad a convertir: ");
        double cantidad = scanner.nextDouble();
        double resultado = 0.0;

        switch (opcion) {
            case 1:
                resultado = cantidad * tasaDolarAPesoArgentino;
                System.out.printf("%.2f Dólares equivalen a %.2f Pesos Argentinos.%n", cantidad, resultado);
                break;
            case 2:
                resultado = cantidad * tasaPesoArgentinoADolar;
                System.out.printf("%.2f Pesos Argentinos equivalen a %.2f Dólares.%n", cantidad, resultado);
                break;
            case 3:
                resultado = cantidad * tasaDolarARealBrasileño;
                System.out.printf("%.2f Dólares equivalen a %.2f Reales Brasileños.%n", cantidad, resultado);
                break;
            case 4:
                resultado = cantidad * tasaRealBrasileñoADolar;
                System.out.printf("%.2f Reales Brasileños equivalen a %.2f Dólares.%n", cantidad, resultado);
                break;
            case 5:
                resultado = cantidad * tasaDolarAPesoColombiano;
                System.out.printf("%.2f Dólares equivalen a %.2f Pesos Colombianos.%n", cantidad, resultado);
                break;
            case 6:
                resultado = cantidad * tasaPesoColombianoADolar;
                System.out.printf("%.2f Pesos Colombianos equivalen a %.2f Dólares.%n", cantidad, resultado);
                break;
        }

        System.out.println("=====================================");
        System.out.println("   ¡Gracias por usar el conversor!");
        System.out.println("=====================================");

        scanner.close();
    }
}

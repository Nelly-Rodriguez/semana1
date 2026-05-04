import java.util.Scanner;

public class PruebaEjercicio2 {
    public static void main(String[] args) {
        Ejercicio2 op = new Ejercicio2();
        try (Scanner entrada = new Scanner(System.in)) {
            // Pide al usuario que escriba dos enteros
            System.out.print("Escriba el primer entero: ");
            op.setNumero1(entrada.nextInt());

            System.out.print("Escriba el segundo entero: ");
            op.setNumero2(entrada.nextInt());

            // Muestra el resultado de la comparación
            op.compararNumeros();
        }
    }
}
import java.util.Scanner;

public class PruebaEjercicio3 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Ejercicio3 op = new Ejercicio3();

            System.out.print("Escriba el primer entero: ");
            int n1 = entrada.nextInt();

            System.out.print("Escriba el segundo entero: ");
            int n2 = entrada.nextInt();

            System.out.print("Escriba el tercer entero: ");
            int n3 = entrada.nextInt();

            op.setNumeros(n1, n2, n3);

            System.out.println("\nResultados:");
            System.out.println("Suma: " + op.sumar());
            System.out.println("Promedio: " + op.promedio());
            System.out.println("Producto: " + op.producto());
            System.out.println("Menor: " + op.buscarMenor());
        }
    }
}
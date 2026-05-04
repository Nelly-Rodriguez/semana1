import java.util.Scanner;

public class PruebaEjercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ejercicio5 op = new Ejercicio5();

        System.out.print("Escriba un número de cinco dígitos: ");
        int n = entrada.nextInt();

        op.setNumero(n);
        
        System.out.println("\nResultado:");
        op.separarEImprimir();

        entrada.close();
    }
}
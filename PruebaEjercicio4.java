import java.util.Scanner;

public class PruebaEjercicio4 {
    public static void main(String[] args) {
        Ejercicio4 op = new Ejercicio4();

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Escriba cinco números enteros:");
            
            System.out.print("Primero: ");
            int n1 = entrada.nextInt();
            
            System.out.print("Segundo: ");
            int n2 = entrada.nextInt();
            
            System.out.print("Tercero: ");
            int n3 = entrada.nextInt();
            
            System.out.print("Cuarto: ");
            int n4 = entrada.nextInt();
            
            System.out.print("Quinto: ");
            int n5 = entrada.nextInt();

            op.setValores(n1, n2, n3, n4, n5);
            
            System.out.println("\n Grupo:");
            op.determinarExtremos();
        }
    }
}
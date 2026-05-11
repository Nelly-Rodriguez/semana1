import java.util.Scanner;

public class PruebaEstudiantes {
    private static double capturarNota(Scanner sc, String prompt) {
        System.out.print(prompt);
        double nota = sc.nextDouble();
        while (nota < 0 || nota > 100) {
            System.out.print("Nota inválida. Ingrese una nota entre 0 y 100: ");
            nota = sc.nextDouble();
        }
        return nota;
    }

    private static String obtenerEstado(double notaFinal) {
        return notaFinal >= 60 ? "Aprobado" : "Reprobado";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Estudiante[] grupo = new Estudiante[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n_ Ingresando datos del estudiante " + (i + 1) + " _");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            double nota1 = capturarNota(sc, "Nota del parcial 1: ");
            double nota2 = capturarNota(sc, "Nota del parcial 2: ");
            double nota3 = capturarNota(sc, "Nota del parcial 3: ");
            double notaProyecto = capturarNota(sc, "Nota del proyecto final: ");

            grupo[i] = new Estudiante(nombre, nota1, nota2, nota3, notaProyecto);
        }

        double sumaNotasFinales = 0;
        double notaAlta = -1;
        String nombreAlta = "";
        double notaBaja = 101;
        String nombreBaja = "";
        int aprobados = 0;

        System.out.println("\n_ RESULTADOS DE LOS ESTUDIANTES _");
        for (int i = 0; i < n; i++) {
            double nf = grupo[i].calcularNotaFinal();
            System.out.printf("%-15s Nota final: %.2f - Estado: %s\n", 
                    grupo[i].getNombre(), nf, obtenerEstado(nf));
        }
    }
}
    
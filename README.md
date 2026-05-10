import java.util.Scanner;

public class PruebaQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("¿Cuántos estudiantes son ? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Estudiante[] grupo = new Estudiante[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n-- Estudiante " + (i + 1) + " --");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            double n1 = capturarNota(sc, "Nota parcial 1 (0-100): ");
            double n2 = capturarNota(sc, "Nota parcial 2 (0-100): ");
            double n3 = capturarNota(sc, "Nota parcial 3 (0-100): ");
            double nP = capturarNota(sc, "Nota proyecto (0-100): ");

            grupo[i] = new Estudiante(nombre, n1, n2, n3, nP);
        }

       
        System.out.println("\n__REPORTE INDIVIDUAL DE ESTUDIANTES_");
        for (Estudiante est : grupo) {
            System.out.println(est.toString());
        }

        
        double sumaNotasFinales = 0;
        double notaAlta = -1;
        double notaBaja = 100;
        String nombreAlta = "";
        String nombreBaja = "";
        int aprobados = 0;

        for (int i = 0; i < grupo.length; i++) {
            double nf = grupo[i].calcularNotaFinal();
            sumaNotasFinales += nf;

            
            if (nf > notaAlta) {
                notaAlta = nf;
                nombreAlta = grupo[i].getNombre();
            }

            // Nota más baja
            if (nf < notaBaja) {
                notaBaja = nf;
                nombreBaja = grupo[i].getNombre();
            }

            
            if (nf >= 70) {
                aprobados++;
            }
        }

        System.out.println("\n_ ESTADÍSTICAS DEL GRUPO_");
        System.out.printf("Promedio del grupo   : %.2f\n", (sumaNotasFinales / n));
        System.out.printf("Nota más alta        : %.2f (%s)\n", notaAlta, nombreAlta);
        System.out.printf("Nota más baja        : %.2f (%s)\n", notaBaja, nombreBaja);
        System.out.println("Estudiantes aprobados : " + aprobados + " de " + n);
    }

    
    public static double capturarNota(Scanner sc, String mensaje) {
        double nota;
        do {
            System.out.print(mensaje);
            nota = sc.nextDouble();
            if (nota < 0 || nota > 100) {
                System.out.println("Error: la nota debe estar entre 0 y 100.");
            }
        } while (nota < 0 || nota > 100);
        sc.nextLine(); 
        return nota;
    }
}

class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notaProyecto;

    public Estudiante(String nombre, double nota1, double nota2, double nota3, double notaProyecto) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaProyecto = notaProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularNotaFinal() {
        return (nota1 + nota2 + nota3 + notaProyecto) / 4;
    }

   
    public String toString() {
        return String.format("%s - N1: %.2f, N2: %.2f, N3: %.2f, Proyecto: %.2f, Final: %.2f",
                nombre, nota1, nota2, nota3, notaProyecto, calcularNotaFinal());
    }
}

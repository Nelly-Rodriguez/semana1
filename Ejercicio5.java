class Ejercicio5 {
    private int numero;

    public Ejercicio5() {
    }

    public void setNumero(int numero) {
        // Validación básica de que el número tenga 5 dígitos
        if (numero < 10000 || numero > 99999) {
            System.out.println("Error: El número debe tener exactamente cinco dígitos.");
        } else {
            this.numero = numero;
        }
    }

    public void separarEImprimir() {
        // Si el número no es válido, no hacemos el proceso
        if (numero < 10000 || numero > 99999) {
            return;
        }

        // Extraemos cada dígito usando división (/) y residuo (%)
        int d1 = numero / 10000;          // Primer dígito
        int d2 = (numero / 1000) % 10;    // Segundo dígito
        int d3 = (numero / 100) % 10;     // Tercer dígito
        int d4 = (numero / 10) % 10;      // Cuarto dígito
        int d5 = numero % 10;             // Quinto dígito

        // Imprimimos los dígitos con tres espacios de separación
        System.out.printf("%d   %d   %d   %d   %d%n", d1, d2, d3, d4, d5);
    }
}
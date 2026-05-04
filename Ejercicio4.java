class Ejercicio4 {
    private int n1, n2, n3, n4, n5;

    public Ejercicio4() {
    }

    public void setValores(int n1, int n2, int n3, int n4, int n5) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }

    public void determinarExtremos() {
        // Inicializamos mayor y menor con el primer número
        int mayor = n1;
        int menor = n1;

        // Comparaciones para encontrar el mayor
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n4 > mayor) {
            mayor = n4;
        }
        if (n5 > mayor) {
            mayor = n5;
        }

        // Comparaciones para encontrar el menor
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        if (n4 < menor) {
            menor = n4;
        }
        if (n5 < menor) {
            menor = n5;
        }

        System.out.println("El entero menor es: " + menor);
        System.out.println("El entero mayor es: " + mayor);
    }
}
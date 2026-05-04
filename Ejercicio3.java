class Ejercicio3 {
    private int numero1;
    private int numero2;
    private int numero3;

    public Ejercicio3() {
    }

    public void setNumeros(int n1, int n2, int n3) {
        this.numero1 = n1;
        this.numero2 = n2;
        this.numero3 = n3;
    }

    public int sumar() {
        return numero1 + numero2 + numero3;
    }

    public int promedio() {
        return (numero1 + numero2 + numero3) / 3;
    }

    public int producto() {
        return numero1 * numero2 * numero3;
    }

    public int buscarMenor() {
        int menor = numero1; // Asumimos que el primero es el menor
        
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }
        return menor;
    }
}
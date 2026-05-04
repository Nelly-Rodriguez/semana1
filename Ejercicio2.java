class Ejercicio2 {
    private int numero1;
    private int numero2;

    public Ejercicio2() {
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return this.numero1;
    }

    public int getNumero2() {
        return this.numero2;
    }

    
    public void compararNumeros() {
        if (this.numero1 > this.numero2) {
            System.out.println(this.numero1 + " es más grande");
        } else if (this.numero2 > this.numero1) {
            System.out.println(this.numero2 + " es más grande");
        } else {
            System.out.println("Estos números son iguales");
        }
    }
}
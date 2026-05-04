public class Ejercicio1Usuario {
    private int numero1;
    private int numero2;
    public Ejercicio1Usuario(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public Ejercicio1Usuario() {
    }
    public void setNumero1(int numero1) {
        if(numero1 < 0) {
            System.out.println("El número no puede ser negativo");
        } else {
            this.numero1 = numero1;
        }
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        if(numero2 < 0) {
            System.out.println("El número no puede ser negativo");
        } else {
            this.numero2 = numero2;
        }
        this.numero2 = numero2;
    }
    public int getNumero1() {
        return this.numero1;
    }
    public int getNumero2() {
        return this.numero2;
    }
    public int sumar() {
        return this.getNumero1() + this.getNumero2();
    
    }
    public int restar() {
        return this.getNumero1() - this.getNumero2();
    }
    public double multiplicar() {
        return this.getNumero1() * this.getNumero2();
    
    }
    public double dividir() {
        if(this.getNumero2() == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        } 
            return this.getNumero1() / this.getNumero2();
        
    }

    int Suma() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
public static void main(String[] args) {
        

        Ejercicio1Usuario Op=new Ejercicio1Usuario();

        Ejercicio1Usuario Op1=new Ejercicio1Usuario();

        Ejercicio1Usuario Op2=new Ejercicio1Usuario();

        int Suma=Op.Suma();
        int resta=Op.restar();
        double multiplicacion=Op.multiplicar();
        double division=Op.dividir();

        System.out.println("La Suma es: " + Suma);
        System.out.println("La Resta es: " + resta);
        System.out.println("La Multiplicación es: " + multiplicacion);
        System.out.println("La División es: " + division);

        Op1.setNumero1(0);
        Op2.setNumero2(0);

        
    }

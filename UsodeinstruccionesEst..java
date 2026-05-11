public class UsodeinstruccionesEst {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notaProyecto; 

    
    public UsodeinstruccionesEst(String nombre, double nota1, double nota2, double nota3, double notaProyecto) { 
        this.nombre = nombre; 
        this.nota1 = (nota1 < 0 || nota1 > 100) ? 0 : nota1; 
        this.nota2 = (nota2 < 0 || nota2 > 100) ? 0 : nota2;
        this.nota3 = (nota3 < 0 || nota3 > 100) ? 0 : nota3;
        this.notaProyecto = (notaProyecto < 0 || notaProyecto > 100) ? 0 : notaProyecto;
    }

   
    public String getNombre() { return nombre; } 
    public void setNombre(String nombrestudiante) { this.nombre = nombrestudiante; } 

    public double getNota1() { return nota1; } 
    public void setNota1(double nota1) {  
        this.nota1 = (nota1 >= 0 && nota1 <= 100) ? nota1 : 0; 
    }

    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { 
        this.nota2 = (nota2 >= 0 && nota2 <= 100) ? nota2 : 0; //
    }

    public double getNota3() { return nota3; }
    public void setNota3(double nota3) { 
        this.nota3 = (nota3 >= 0 && nota3 <= 100) ? nota3 : 0; 
    }

    public double getNotaProyecto() { return notaProyecto; } 
    public void setNotaProyecto(double notaProyecto) { 
        this.notaProyecto = (notaProyecto >= 0 && notaProyecto <= 100) ? notaProyecto : 0; 
    }

    
    public double calcularNotaFinal() { 
        double promedioParciales = (nota1 + nota2 + nota3) / 3.0; 
        return (promedioParciales * 0.70) + (notaProyecto * 0.30); 
    }

   
    public String obtenerEstado() { 
        double nf = calcularNotaFinal(); 
        if (nf >= 90) return "Excelente"; 
        else if (nf >= 80) return "Bueno"; 
        else if (nf >= 70) return "Aprobo";
        else if (nf >= 60) return "Recuperacion";
        else return "Regular";
    } 
}
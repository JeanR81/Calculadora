package Calculadora;

public class Subtracao implements Operacao {

    private double numeroA;
    private double numeroB;
    public Subtracao(double numeroA, double numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }
    @Override
    public double calcula() {return numeroA - numeroB;
    }
    @Override
    public String toString() {
        return "Subtração de " + numeroA + " - " + numeroB + " = " + calcula();
    }
}




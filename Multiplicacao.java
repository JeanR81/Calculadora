package Calculadora;

public class Multiplicacao implements Operacao{

    private double numeroA;
    private double numeroB;
    public Multiplicacao(double numeroA, double numeroB){
        this.numeroB = numeroB;
        this.numeroA = numeroA;
    }
    @Override
    public double calcula() {return numeroA * numeroB;
    }
    @Override
    public String toString() {
        return "Multiplicação de " + numeroA + " x " + numeroB + " = " + calcula();
    }

    }

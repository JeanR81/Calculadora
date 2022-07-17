package Calculadora;

public class Divisao implements Operacao {

    private double numeroA;
    private double numeroB;
    public Divisao(double numeroA, double numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }
    @Override
    public double calcula() {return numeroA / numeroB;
    }
    @Override
    public String toString() {return "Divisão de " + numeroA + " / " + numeroB + " = " + calcula();
    }
}
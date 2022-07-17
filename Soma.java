package Calculadora;

public class Soma implements Operacao{

    private double numeroA;
    private double numeroB;
    public Soma(double numeroA, double numeroB){
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }
    @Override
    public double calcula() {return numeroA + numeroB;
    }
    @Override
    public String toString(){
        return "Soma de "+numeroA +" + "+numeroB+" = "+ calcula();
    }
    }



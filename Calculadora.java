package Calculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    private List<Operacao> operacoes = new ArrayList<>();
    public List<Operacao> getOperacoes(){
        return operacoes;
    }
    public double executaOperacao(Operacao operacao){
        operacoes.add(operacao);
        return operacao.calcula();
    }
}

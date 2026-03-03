package Exercício01;

public class Produto {
    String nome;
    double valor;
    int quantDisponivel;

    //metodo construtor
    public Produto(String nome, double valor, int quantDisponivel){
        this.nome = nome;
        this.valor = valor;
        this.quantDisponivel = quantDisponivel;

        //acessando um objeto no construtor
    }

    public void aumentarValorProduto (double porcentagem){
        valor *= (1+ porcentagem/100);
    }
}

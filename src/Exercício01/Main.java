package Exercício01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int quantDisponivel;
        double porcentagem;

        //primeiro pega os dados e dps quantifica o objeto

        System.out.print("Digite o nome do produto:");
        nome = sc.nextLine();
        System.out.print("Digite o valor do produto "+nome+": R$");
        valor = sc.nextDouble();
        System.out.print("Digite a quantidade do estoque do "+nome+":");
        quantDisponivel= sc.nextInt();

        Produto pr = new Produto(nome,valor,quantDisponivel);
        //se chama o objeto depois de ter pedido as informações para o usuario

        //porcentagem para aumentar o valor do produto
        System.out.print("Qual a porcentagem de aumento?");
        porcentagem = sc.nextDouble();


        //pr.aumentarValorProduto(40);



        System.out.println();
        System.out.println("Preço do produto "+pr.nome);
        System.out.println(pr.valor);


    }
}

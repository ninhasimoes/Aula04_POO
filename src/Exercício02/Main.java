package Exercício02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String nome;
        //Scanner sc = new Scanner(System.in);

        SenhaAtendimento s1 = new SenhaAtendimento("Ana");
        SenhaAtendimento s2 = new SenhaAtendimento("Luiza");
        SenhaAtendimento s3 = new SenhaAtendimento("Simões");


        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Próxima senha disponível --> "+ SenhaAtendimento.controle);
        // por ser uma variavel da classe deve ser chamada pelo nome da classe
    }
}

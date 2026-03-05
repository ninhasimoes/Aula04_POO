package Exercício02;

public class SenhaAtendimento {
    int senha;
    String nome;

    //static fica fora do objeto
    //static não vai para dentro do objeto
    // senha não foi recebida no main n precisa de paramento no metodo
    // dados mocados para inventar dados

    static int controle = 100;

    //construtor(sem tipo) possui o mesmo nome da clase
    public SenhaAtendimento(String nome){
        this.nome = nome;
        this.senha = controle++;
        //++controle add 101 na primeira

    }
    public String getDados(){
        return "Paciente: "+nome+" | Senha # "+senha;
        //contanação com aspas faz virar um string
    }



}

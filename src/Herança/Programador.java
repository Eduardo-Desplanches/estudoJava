package Herança;

public class Programador extends Pessoa implements Profissão{
    final String profissao = "programador";
    @Override
    public void profissao(){
        System.out.println("Eu sou " + nome + " e sou " + profissao + ".");
    }
    @Override
    public void descreverProfissao() {
        System.out.println("Eu desenvolvo softwares para aplicaçãos com diferentes linguagens de computação.");
    }
}

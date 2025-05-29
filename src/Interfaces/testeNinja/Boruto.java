package Interfaces.testeNinja;

public class Boruto extends Uzumaki implements HyugaUzumaki{
    @Override
    public void ativarJougan() {
        System.out.println("Eu ativei o Jougan");
    }

    @Override
    public void ativarKarma() {
        System.out.println("Eu ativei o Karma");
    }
}

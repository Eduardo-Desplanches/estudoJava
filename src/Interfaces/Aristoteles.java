package Interfaces;

public class Aristoteles implements Filosofo{
    @Override
    public String getNome() {
        return "Aristóteles";
    }

    @Override
    public String getEscola() {
        return "Liceu";
    }

    @Override
    public String getPeriodo() {
        return "Antes de Cristo";
    }

    @Override
    public String criticar(Filosofo outro) {
        if(outro.equals("Platão")){
            return "Discordo que a máteria esteja seperado da máteria, mestre!";
        }
        return "Falta beleza em sua maneira de pensar.";
    }

    @Override
    public String filosofar() {
        return "O sábio nunca diz tudo o que pensa, mas pensa tudo o que diz";
    }
}

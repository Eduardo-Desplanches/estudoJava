package BigO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Algoritmo -> é tudo que fazemos em programação
        //Big O Notation -> Medida de escabilidade, seja pela complexidade espacial(leva em cosideração o uso da memória) ou temporal(tempo de execução)
        ArrayList<Ninjas> ninjas = new ArrayList<>();
        ninjas.add(new Ninjas("Naruto Uzumaki", 17));
        ninjas.add(new Ninjas("Sasuke Uchiha", 17));
        ninjas.add(new Ninjas("Sakura Haruno", 17));

        //O(1) - Complexidade Constante
        System.out.println(ninjas.get(2));

        //O(N) - Complexidade Linear
//        for (Ninjas ninja:ninjas) {
//            System.out.println(ninja);
//        }

        System.out.println("============================");
        // O(N²) - Complexidade Quadrática
        for (int i = 0; i <ninjas.size() ; i++) {
            for (Ninjas ninja : ninjas) {
                System.out.println(ninjas.get(i) + " x " + ninja);
            }
        }

        //Metrificação da qualidade dos algoritmos:

        /*O(1) -> Complexidade Constante
        * O(LOG N) -> Complexidade Logarítmica
        * O(N) -> Complexidade Linear
        * O(N LOG N) -> Complexidade Linear-Logarítmica
        * O(N²) -> Complexidade Quadrática
        * O(N³) -> Complexidade Cúbica
        * O(2^N) -> Complexidade Exponencial
        * O(N!) -> Complexidade Fatorial
        *  */
    }
}

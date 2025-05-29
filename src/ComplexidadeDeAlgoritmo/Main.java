package ComplexidadeDeAlgoritmo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Long inicio;
        Long fim;
        Long tempo;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        int a = 10000000;
        int b = 1923233321;
        int c = a + b; // O(1) -> A execução do algoritmo leva o mesmo tempo, independentemente do tamanho da entrada.

        //O(n) -> O tempo de execução cresce linearmente com o tamanho da entrada. Exemplo: percorrer todos os elementos de uma lista.
        //O(n²)  -> For dentro de um for (nestedloop)
        for (int i = 0; i < 205000 ; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        inicio = System.nanoTime();
        arrayList.remove(2000); // O(N) -> Complexidade Linear
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo ArrayList: " + tempo + " ns (nano segundo)");

        inicio = System.nanoTime();
        linkedList.remove(2000); // O(1) -> Complexidade Constante -> É melhor porque é constante e não tem oscilações
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo LinkedList: " + tempo + " ns (nano segundo)");
    }
}

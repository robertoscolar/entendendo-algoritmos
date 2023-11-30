package capitulo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort2 {

    public static void main(String[] args) {

        List<Integer> minhaLista = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        List<Integer> novaLista = ordenacaoPorSelecao(minhaLista);

        for (int item : novaLista) {
            System.out.printf("%d ", item);
        }
    }

    private static int buscaMenor(List<Integer> lista) {
        int menor = lista.get(0);
        int menorIndice = 0;

        for (int item : lista) {
            if (item < menor) {
                menor = item;
                menorIndice = lista.indexOf(item);
            }
        }

        return menorIndice;
    }

    public static List<Integer> ordenacaoPorSelecao(List<Integer> lista) {
        List<Integer> novaLista = new ArrayList<>();
        int menorIndice;
        int tamanhoLista = lista.size();

        for (int i = 0; i < tamanhoLista; i++) {
            menorIndice = buscaMenor(lista);
            novaLista.add(lista.get(menorIndice));

            lista.remove(menorIndice);
        }

        return novaLista;
    }
}

package capitulo2;

public class SelectionSort {

    public static void main(String[] args) {

        int[] minhaLista = {5, 3, 6, 2, 10};
        int[] novaLista = ordenacaoPorSelecao(minhaLista);

        for (int i = 0; i < novaLista.length; i++) {
            System.out.printf("%d ", novaLista[i]);
        }
    }

    private static int buscaMenor(int[] vetor) {
        int menor = vetor[0];
        int menorIndice = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                menorIndice = i;
            }
        }

        return menorIndice;
    }

    public static int[] ordenacaoPorSelecao(int[] vetor) {
        int [] novoVetor = new int[vetor.length];
        int menor;

        for (int i = 0; i < vetor.length; i++) {
            menor = buscaMenor(vetor);
            novoVetor[i] = vetor[menor];

            vetor[menor] = Integer.MAX_VALUE;
        }

        return novoVetor;
    }
}
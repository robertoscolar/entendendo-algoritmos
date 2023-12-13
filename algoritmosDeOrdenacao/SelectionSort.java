package algoritmosDeOrdenacao;

public class SelectionSort {

    public static void main(String[] args) {
        int[] vetorDesordenado = {7, 5, 1, 8, 3, 10, 50, 19};
        int[] vetorOrdenado = selectionSort(vetorDesordenado);

        imprimeVetor(vetorOrdenado);
    }

    public static int[] selectionSort(int[] vetor) {

        for (int i = 0; i < (vetor.length - 1); i++) {
            int minimoIndex = i;

            for (int j = i; j < vetor.length; j++) {
                if (vetor[j] < vetor[minimoIndex]) {
                    minimoIndex = j;
                }
            }

            if (vetor[i] > vetor[minimoIndex]) {
                int variavelAuxiliar = vetor[i];
                vetor[i] = vetor[minimoIndex];
                vetor[minimoIndex] = variavelAuxiliar;
            }
        }

        return vetor;
    }

    public static void imprimeVetor(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);
        }
    }
}

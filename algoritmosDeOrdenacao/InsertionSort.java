package algoritmosDeOrdenacao;

public class InsertionSort {

    public static void main(String[] args) {
        int[] vetorDesordenado = {7, 5, 1, 8, 3, 10, 50, 19};
        int[] vetorOrdenado = insertionSort(vetorDesordenado);

        imprimeVetor(vetorOrdenado);
    }

    public static int[] insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = chave;
        }
        return vetor;
    }

    public static void imprimeVetor(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);
        }
    }
}

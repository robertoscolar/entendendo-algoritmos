package algoritmosDeOrdenacao;

public class BubbleSort {

    public static void main(String[] args) {
        int[] vetorDesordenado = {7, 5, 1, 8, 3, 10, 50, 19};
        int[] vetorOrdenado = bubbleSort(vetorDesordenado);

        imprimeVetor(vetorOrdenado);
    }

    public static int[] bubbleSort(int[] vetor) {
        for (int i = 0; i < (vetor.length -1); i++) {
            for(int j = 0; j < (vetor.length -1) ; j++) {
                if (vetor[j] > vetor[j+1]) {
                    int variavelAuxiliar = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = variavelAuxiliar;
                }
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

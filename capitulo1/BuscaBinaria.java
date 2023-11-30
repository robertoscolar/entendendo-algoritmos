package capitulo1;

public class BuscaBinaria {

    public static void main(String[] args) {

        int[] minhaLista = {1, 3, 5, 7, 9};

        System.out.println(buscaBinaria(minhaLista, 3));
        System.out.println(buscaBinaria(minhaLista, -1));
    }

    public static Integer buscaBinaria(int[] vetor, int item) {
        int alto = vetor.length - 1;
        int baixo = 0;
        int meio;
        int chute;

        while (baixo <= alto) {
            meio = (baixo + alto) / 2;
            chute = vetor[meio];

            if (chute == item) {
                return meio;

            } else if (chute > item) {
                alto = meio - 1;

            } else {
                baixo = meio + 1;
            }
        }
        return null;
    }
}

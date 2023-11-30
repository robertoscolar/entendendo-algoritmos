package capitulo3;

public class PilhaChamada {

    public static void main(String[] args) {
        sauda("Cliente");
    }

    public static void sauda(String nome) {
        System.out.printf("Olá %s \n", nome);
        sauda2(nome);
        System.out.println("Preparando para dizer tchau...");
        tchau();
    }

    private static void sauda2(String nome) {
        System.out.printf("Como vai %s? \n", nome);
    }

    private static void tchau() {
        System.out.println("Ok, tchau!");
    }
}

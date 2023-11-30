package capitulo3;

public class Fatorial {

    public static void main(String[] args) {
        System.out.println(calcularFatorial(5));
    }

    public static int calcularFatorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * calcularFatorial(x - 1);
        }
    }
}

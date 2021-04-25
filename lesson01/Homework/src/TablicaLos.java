import java.util.Random;

public class TablicaLos {
    public static void main(String[] args) {
        int[] tab = new int[20];
        int len = tab.length;


        System.out.print("tablica:{");

        for (int i = 0; i < len; i++) {
            tab[i] = new Random().nextInt(100) +1;

            System.out.print(tab[i]);
            if (i < len - 1) System.out.print(",");
        }

        System.out.print("}");
    }
}

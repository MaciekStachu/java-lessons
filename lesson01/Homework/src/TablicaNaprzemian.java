public class TablicaNaprzemian {
    public static void main(String[] args) {
        int[] tab = new int[10];
        int len = tab.length;

        System.out.print("tablica:{");

        for (int i = 0; i < len; i++) {
            tab[i] = i + 1;
            if (i % 2 != 0) tab[i] *= -1;
            System.out.print(tab[i]);
            if (i < len - 1) System.out.print(",");
        }

        System.out.print("}");
    }
}



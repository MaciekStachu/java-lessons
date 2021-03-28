import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        System.out.println("Podaj dwie liczby");
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();

        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}

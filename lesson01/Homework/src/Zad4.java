import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        int x = new Scanner(System.in).nextInt();
        int silnia = 1;

        for (int i = 1; i <= x; i += 1) {
            silnia = silnia * i;
        }
        System.out.println("Silnia = " + silnia);
    }
}



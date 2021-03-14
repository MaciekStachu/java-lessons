import java.util.Scanner;

public class Lesson01 {
    public static void main(String[] args) {
        // System.out.println("Maciek to król");
        System.out.println("Podaj swoj wiek");
        int wiek = new Scanner(System.in).nextInt();
        System.out.println("Twoj wiek to: " + wiek);

        if ((wiek > 0) && (wiek < 20)) {
            System.out.println("Jestes mlody");
        } else if (wiek >= 20) {
            System.out.println("Jestes w srdnim wikeu lub stary");
        } else {
            System.out.println("Wprowadziles zly wiek");
        }
    }
}

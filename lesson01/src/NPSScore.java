import java.util.Scanner;

public class NPSScore {

    public static void main(String[] args) {
        System.out.println("Jak oceniasz nasz produkt:");
        int ocena = new Scanner(System.in).nextInt();

        if (ocena < 0) System.out.println("Wpisz wartość z zakresu 0-10");
        if (ocena > 10) System.out.println("Wpisz wartość z zakresu 0-10");

        if ((ocena >= 0) && (ocena <= 6)) {
            System.out.println("jesteś detractorem");
        } else if ((ocena >= 7) && (ocena <= 8)) {
            System.out.println("jesteś nautralny");
        } else if ((ocena >= 9) && (ocena <= 10)) {
            System.out.println("promujesz nasz produkt");
        }
    }
}



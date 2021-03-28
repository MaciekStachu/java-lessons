import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe:");
        int star = new Scanner(System.in).nextInt();
//        int x= 0;
//        while (x < star) {
//            System.out.println("*");
//            x+=1;
//        }
        for (int i = 0; i < star; i++){
            System.out.println("*");
        }
    }
}

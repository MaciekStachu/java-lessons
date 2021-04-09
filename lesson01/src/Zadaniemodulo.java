public class Zadaniemodulo {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("reszta z dzielenia przez 3 rowna sie:" + x % 3);
        if (x % 2 != 0) {
            System.out.println("liczba jest nieparzysta");
        } else {
            System.out.println("liczba jest parzysta");
        }

        for (int i = 0; i < 10; i++) {
          if (i % 2 == 0) {
              System.out.println(i);
          }
        }
    }
}

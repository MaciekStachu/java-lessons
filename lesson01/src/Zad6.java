public class Zad6 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        System.out.println("x\t\ty\t\tx+y\t\tx-y\t\tx*y\t\tx/y");
        for (x = 0; x < 10; x++) {
            for (y = 0; y < 10; y++) {
                System.out.print(x + "\t\t" + y + "\t\t" + (x + y) + "\t\t" + (x - y) + "\t\t" + (x * y) + "\t\t");
                if (y != 0) {
                    System.out.println(x / y);
                } else {
                    System.out.println("-");

                }
            }

        }
    }
}


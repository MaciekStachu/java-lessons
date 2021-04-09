public class Tablica {
    public static void main(String[] args) {
        int[] tab = new int[10];
        tab[2] = 1300;
        tab[7] = 112;
        tab[9] = 889;

//        System.out.println("tab[2] = " + tab[2]);
//        System.out.println("tab[7] = " + tab[7]);
        int tablength = tab.length;
        System.out.println("tab ma dlugosc " + tab.length);
        for (int i = 0; i < tablength; i++){
            System.out.println(i + ": " + tab[i]);
        }


//        int[] tab2 = {10,13};
//        System.out.println(tab2[0]);
//        System.out.println(tab2[1]);
//        System.out.println(tab2[2]);
//        System.out.println(tab2[3]);
    }
}

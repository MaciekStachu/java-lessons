public class ZadanieArrays01 {
    //ciag arytmetyczny
    public static void main(String[] args) {
        int[] tab = new int[20];
        int len = tab.length;
        int x = 1;
        for (int i = 0; i < len; i ++){
            //0 2 4 6 8 10 12 14 16 18
            tab[i] = x;
            x +=2;
        }
//        tablica:{1,2,3,4,5,6,7,8,9,10}
        System.out.print("tablica:{");

        for (int i = 0; i < len; i++){
            System.out.print(tab[i]);
            if(i < len - 1) System.out.print(",");
        }
        System.out.print("}");
    }
}

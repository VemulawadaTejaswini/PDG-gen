import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String ans = "";

        int[] abm = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] an = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bn = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cheapestAn = 999999;
        for(int i=0; i<an.length; i++) {
            if (an[i] < cheapestAn) cheapestAn = an[i];
        }
        int cheapestBn = 999999;
        for(int i=0; i<bn.length; i++) {
            if (bn[i] < cheapestBn) cheapestBn = bn[i];
        }
        int mostCheap = cheapestAn + cheapestBn;

        for (int i = 0; i < abm[2]; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = sc.nextInt();
            int usedCoupon = an[x - 1] + bn[y - 1] - c;
            if (usedCoupon < mostCheap) {
                mostCheap = usedCoupon;
            }
        }
        System.out.println(mostCheap);
    }
}

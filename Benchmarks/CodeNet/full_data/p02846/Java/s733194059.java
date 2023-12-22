import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        long a1 = sc.nextLong();
        long a2 = sc.nextLong();
        long b1 = sc.nextLong();
        long b2 = sc.nextLong();


        long d1 = t1 * a1 + t2 * a2;
        long d2 = t1 * b1 + t2 * b2;
        if(d1 == d2) {
            System.out.println("infinity");
            return;
        }
        if(a1 < b1 && a2 < b2 || a1 > b1 && a2 > b2) {
            System.out.println(0);
            return;
        }

        if(d1 < d2) {
            long temp = a1;
            a1 = b1;
            b1 = temp;
            temp = a2;
            a2 = b2;
            b2 = temp;
            temp = d1;
            d1 = d2;
            d2 = temp;
        }
        long d = d1 - d2;
        if(a1 > b1) {
            System.out.println(0);
            return;
        }

        long adv = ((b1-a1) * t1);

        long div = adv / d;
        long rem = adv % d;

        long res = div * 2;
        if( rem > 0) res++;


        System.out.println(res);
    }


}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] a = new long[5];
        long min = Long.MAX_VALUE;
        for (int i = 0 ; i < 5 ; i++) {
                a[i] = sc.nextLong();
                min = Math.min(min, a[i]);

        }

        long m = 0;
        if (n % min == 0) {
            m = n / min;
        } else {
            m = n / min + 1;
        }

        long ans = m + 5;




        System.out.println(ans - 1);
    }

}
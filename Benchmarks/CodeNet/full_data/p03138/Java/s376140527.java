import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        System.out.println(findMaximumValue(A, K));
    }

    static long findMaximumValue(long x[], long k) {
        long max = x[0];
        long check = 0;
        int start = 0;
        while (start < k) {
            for (int i = 0; i < x.length; i++) {
                   check = check + (x[i] ^ start);

            }
            start++;
            if (check > max) {
                max = check;
            }
            check = 0;
        }
        return max;
    }

}

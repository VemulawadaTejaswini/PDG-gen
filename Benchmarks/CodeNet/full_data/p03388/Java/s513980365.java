import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();
        int[] A = new int[Q];
        int[] B = new int[Q];
        for (int i = 0; i < Q; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        for (long ans : solve(Q, A, B)) {
            System.out.println( ans );
        }
    }

    private static long[] solve(int Q, int[] A, int[] B) {
        long[] ans = new long[Q];
        for (int i = 0; i < Q; i++) {
            ans[i] = calc(A[i], B[i]);
        }
        return ans;
    }

    private static long calc(int a, int b) {
        if( a == b ) {
            return calcSquare(a);

        } else {
            return calcNormal(a, b);
        }
    }

    private static long calcNormal(int a, int b) {
        long ab = (long)a * b;
        long r = (long)Math.floor(Math.sqrt(ab));
        long q = ab / r;

        int plusQr = ab > (q * r) ? 1 : 0;
        return (r-1) + (q-1) + plusQr - 1;
    }

    private static long calcSquare(int a) {
        long r = a-1;
        return r * 2;
    }
}

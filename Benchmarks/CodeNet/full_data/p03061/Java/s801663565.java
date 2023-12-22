import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        long L[] = new long[N + 1];
        long R[] = new long[N + 1];

        for (int i = 0; i < N; i++) {
            L[i + 1] = gcd(A[i], L[i]);
            R[N - i - 1] = gcd(A[N - i - 1], R[N - i]);
        }

        long[] MAX = new long[N];
        long max = 0;
        for (int i = 0; i < N; i++) {
            MAX[i] = gcd(L[i], R[i + 1]);

            if (max < MAX[i]) {
                max = MAX[i];
            }
        }

        System.out.println(max);
    }

    private static long gcd(long i, long j) {
        if (j == 0) {
            // recursive divide complete
            return i;
        }
        if (i % j == 0) {
            return j;
        } else {
            return gcd(j, i % j);
        }
    }
}

import java.util.Scanner;
import java.io.BufferedInputStream;
import java.lang.Math;

public class Main{
    static long tmp = 10000 * 10000;
    static long MAX_COUNT = tmp * tmp + 999;

    public static void main(String [] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        long K = sc.nextLong();
        for(int N = 2; N <= 50; N++) {
            if(solve(K,N)) {
                break;
            }
        }
    }

    static boolean solve(long K, int N) {
        long C = K / N + N - 1;
        long [] A = new long [N];
        for(int i = 0; i < N; i++) {
            A[i] = C;
        }
        for(int i = 0; i < (K % N); i++) {
            long max = 0;
            int p = 0;
            for(int j = 0; j < N; j++) {
                if(A[j] > A[p]) {
                    p = j;
                    max = A[j];
                }
            }

            for(int j = 0; j < N; j++) {
                if((A[j] + N + 1 > max) && (A[j] < A[p])) {
                    p = j;
                }
            }

            for(int j = 0; j < N; j++) {
                A[j] = A[j] - 1;
            }
            A[p] = A[p] + N + 1;
        }

        for(int i = 0; i < N; i++) {
            if(A[i] < 0) {
                return false;
            }
            if(A[i] > MAX_COUNT) {
                return false;
            }
        }

        System.out.println(N);
        for(int i = 0; i < N; i++) {
            System.out.println(A[i] + " ");
        }

        return true;
    }
}
// n = 50 : 50 round -> max-=1
// final max = 49

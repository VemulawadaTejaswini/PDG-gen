import java.util.Scanner;
import java.io.BufferedInputStream;
import java.lang.Math;

public class Main{
    static long tmp = 100000000;
    static long MAX_COUNT = tmp * tmp;

    public static void main(String [] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        long K = sc.nextLong();
        int N = 2;
        for(int i = 2; i <= 50; i++) {
            long C = K / i + N - 1;
            if(C > 0 && C < MAX_COUNT) {
                N = i;
                break;
            }
        }

        long C = K / N + N - 1;
        long [] A = new long [N];
        for(int i = 0; i < N; i++) {
            A[i] = C;
        }
        for(int i = 0; i < (K % N); i++) {
            int p = 0;
            for(int j = 0; j < N; j++) {
                if(A[j] > A[p]) {
                    p = j;
                }
            }
            for(int j = 0; j < N; j++) {
                A[j] = A[j] - 1;
            }
            A[p] = A[p] + N + 1;
        }
        System.out.println(N);
        for(int i = 0; i < N; i++) {
            System.out.println(A[i] + " ");
        }
    }
}
// n = 50 : 50 round -> max-=1
// final max = 49

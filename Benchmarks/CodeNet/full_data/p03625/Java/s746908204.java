import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println( solve(N, A) );
    }

    private static int solve(int N, int[] A) {
        // pairを探して max * max2

        // reverseってないんかな...
        Arrays.sort(A);
        int prev = -1;
        int max = 0;
        for (int i = N-1; i >=0 ; i--) {
            if( A[i] == prev ) {
                if( max == 0 ) {
                    max = A[i];
                    prev = -1;

                } else {
                    return max * A[i];
                }

            } else {
                prev = A[i];
            }
        }
        return 0;
    }
}

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
        Arrays.sort(A);

        int max = -1;
        int prev2 = 0; // 二つ前
        int prev1 = 0; // 一つ前
        int current = 0;
        int current_a = -1;

        for (int i = 0; i < N; i++) {
            int a = A[i];

            if( a != current_a ) {
                max = Math.max(prev2 + prev1 + current, max);

                prev2 = prev1;
                prev1 = current;
                current_a = a;
                current = 1;

            } else {
                current++;
            }
        }

        max = Math.max(prev2 + prev1 + current, max);

        return max;
    }
}

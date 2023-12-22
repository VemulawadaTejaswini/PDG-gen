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

    private static long solve(int N, int[] A) {
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += calc(i, N, A);
        }
        return ans;
    }

    private static int calc(int i, int N, int[] A) {
        int ret = 1;
        int prev = A[i];

        for (int j = i+1; j < N; j++) {
            int xor = prev ^ A[j];
            int sum = prev + A[j];
            if( xor == sum ) {
                ret++;
                prev = sum;
            } else {
                return ret;
            }
        }

        return ret;
    }
}
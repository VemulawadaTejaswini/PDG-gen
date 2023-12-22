import java.util.Scanner;
import java.util.StringJoiner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(N, T, A) );
    }

    private static int solve(int N, int T, int[] A) {
        int[] B = new int[N];
        B[N-1] = 0;
        int maxB = 0;
        int high = A[N-1];
        for (int i = N-2; i >=0 ; i--) {
            if( A[i] > high ) {
                high = A[i];
            }
            B[i] = high - A[i];
            maxB = Math.max(B[i], maxB);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if( B[i] == maxB ) ans++;
        }

        return ans;
    }

    private static void show(int[] array) {
        StringJoiner j = new StringJoiner(" ");
        for (int i : array) {
            j.add(String.valueOf(i));
        }
        System.err.println( j.toString() );
    }
}
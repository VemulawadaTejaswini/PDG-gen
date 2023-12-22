import java.util.Scanner;

public class Main {

    private static int N;
    private static int[] P;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        System.out.println(solve());
    }

    private static int solve() {
        int mae = 0;
        int expected = 1;
        for (int i = 0; i < N; i++) {
            int p = P[i];
            if( p != expected ) {
                mae++;
            } else {
                expected++;
            }
        }

        int ushiro =0;
        expected = N;
        for (int i = N-1; i >= 0; i--) {
            int p = P[i];
            if( p != expected ) {
                ushiro++;
            } else {
                expected--;
            }
        }

        return Math.min(mae, ushiro);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] W = new int[N];
        int[] P = new int[N];
        for (int i=0; i<N; i++) {
            W[i] = sc.nextInt();
        }

        System.out.println(solve(N, W));
    }

    private static int solve(int N, int[] W) {
        int min = Integer.MAX_VALUE;
        int S1 = 0;
        int S2 = 0;
        for (int i=0; i<N; i++) {
            S2 += W[i];
        }

        for (int t=0; t<N; t++) {
            S1 += W[t];
            S2 -= W[t];

            min = Math.min(min, Math.abs(S1 - S2));
        }

        return min;
    }
}

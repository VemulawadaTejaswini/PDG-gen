import java.util.*;

public class Main {
    private final static int M = 1000000007;

    private static int solve(int N, boolean[][] a) {
        int states = 1 << N;

        int[] count = new int[states];
        count[0] = 1;

        for (int state = 1; state < states; state++) {
            int i = Integer.bitCount(state) - 1;

            for (int j = 0, p = 1; j < N; j++, p <<= 1) {
                if (!a[i][j]) continue;

                int prevState = state & ~p;
                if (prevState == state) continue;

                count[state] = (count[state] + count[prevState]) % M;
            }
        }

        return count[states-1];
    }

    public static int run(Scanner scanner) {
        int N = scanner.nextInt();
        boolean[][] a = new boolean[N][N];
        for (int i=0; i < N; i++)
            for (int j=0; j < N; j++)
                a[i][j] = scanner.nextInt() == 1;

        return solve(N, a);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}
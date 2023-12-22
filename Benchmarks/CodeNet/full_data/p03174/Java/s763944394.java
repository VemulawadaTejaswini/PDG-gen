import java.util.*;

public class Main {
    private final static int M = 1000000007;

    private static int solve(int N, boolean[][] a) {
        int states = 1 << N;
        int[] count = new int[states];
        Arrays.fill(count, 1);

        for (int i = 0; i < N; i++)
            for (int state = states-1; state >= 0; state--) {
                int newCount = 0;
                for (int j = 0; j < N; j++) {
                    if (!a[i][j]) continue;
                    if ((state & (1 << j)) == 0) continue;

                    int stateWithout = state & ~(1 << j);
                    newCount = (newCount + count[stateWithout]) % M;
                }
                count[state] = newCount;
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

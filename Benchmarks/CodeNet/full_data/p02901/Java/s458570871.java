import java.util.Arrays;
import java.util.Scanner;

class Key {
    final int cost;
    final int open;

    Key(int cost, int open) {
        this.cost = cost;
        this.open = open;
    }
}

class Solver {

    private final Key[] keys;
    private final int N;

    Solver(Scanner in) {
        N = in.nextInt();
        int m = in.nextInt();
        keys = new Key[m];
        for (int i = 0; i < m; i++) {
            int cost = in.nextInt();
            int B = in.nextInt();
            int bits = 0;
            for (int j = 0; j < B; j++) {
                bits |= 1 << (in.nextInt() - 1);
            }
            keys[i] = new Key(cost, bits);
        }
    }

    void solve() {
        int[] dp = new int[1 << N];
        Arrays.fill(dp, 1000000000);
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (Key key : keys) {
                dp[i | key.open] = Math.min(dp[i | key.open], dp[i] + key.cost);
            }
        }
        int result = dp[(1 << N) - 1];
        if (result == 1000000000) System.out.println(-1);
        else System.out.println(result);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}
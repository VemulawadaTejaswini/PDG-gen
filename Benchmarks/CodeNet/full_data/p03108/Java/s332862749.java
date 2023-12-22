import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        int[][] q = new int[M][2];
        for (int i = 0; i < M; i++) {
            q[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).map(x -> x - 1).toArray();
        }

        UFT uft = new UFT(N);
        long ans[] = new long[M];
        for (int i = 1; i < N; i++) {
            ans[M - 1] += i;
        }
        for (int i = M - 1; i >= 1; i--) {
            int f = q[i][0];
            int t = q[i][1];
            if (!uft.same(f, t)) {
                ans[i - 1] = Math.max(0, ans[i] - uft.cnt(f) * uft.cnt(t));
            }
            uft.merge(f, t);
        }

        for (long a: ans) {
            System.out.println(a);
        }

    }

    static class UFT {
        int x;
        int[] par;
        int[] cnt;

        UFT(int x) {
            this.x = x;
            par = new int[x];
            cnt = new int[x];
            for (int i = 0; i < x; i++) {
                par[i] = i;
                cnt[i] = 1;
            }
        }

        int root(int x) {
            if (x == par[x]) {
                return x;
            }
            int root = root(par[x]);
            par[x] = root;
            return root;
        }

        void merge(int x, int y) {
            int xr = root(x);
            int yr = root(y);
            par[y] = xr;
            cnt[xr] += cnt[yr];
        }

        boolean same(int x, int y) {
            return root(x) == root(y);
        }

        int cnt(int x) {
            return cnt[root(x)];
        }
    }

}

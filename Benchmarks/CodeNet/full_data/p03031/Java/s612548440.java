import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // num of switch
        int n = sc.nextInt();
        // num of light bulb
        int m = sc.nextInt();

        // switches each light bulb is connected to
        int[][] s = new int[m][];

        // when light bulb is on
        boolean[] p = new boolean[m];

        for (int i=0; i < m; i++) {
            int k = sc.nextInt();
            s[i] = new int[k];
            for (int j=0; j < k; j++) {
                s[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i < m; i++)
            p[i] = itob(sc.nextInt());

        AtomicInteger ans = new AtomicInteger(0);

        dfs(0, n, ans, new boolean[n], s, p);

        System.out.println(ans);
    }

    private static boolean itob(int i) {
        return i == 1;
    }

    private static void dfs(int depth, int maxDepth, AtomicInteger ans, boolean[] sw, int[][] s, boolean[] p) {
        if (depth == maxDepth) {
            if (check(sw, s, p))
                ans.getAndIncrement();
        } else {
            sw[depth] = true;
            dfs(depth+1, maxDepth, ans, sw, s, p);

            sw[depth] = false;
            dfs(depth+1, maxDepth, ans, sw, s, p);
        }
    }

    private static boolean check(boolean[] sw, int[][] s, boolean[] p) {
        for (int i=0; i < p.length; i++) {
            boolean bulb = false;

            for (int as : s[i]) {
                if (sw[as-1])
                    bulb = !bulb;
            }
            if (bulb != p[i]) {
                return false;
            }
        }
        return true;
    }

}

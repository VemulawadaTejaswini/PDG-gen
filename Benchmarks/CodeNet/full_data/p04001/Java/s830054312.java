import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n;
    String s;
    long sum = 0;
    boolean[] splitAts;
    void run() {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        n = s.length();
        splitAts = new boolean[n - 1];
        dfs(0);
        System.out.println(sum);
    }

    void dfs(int i) {
        if (i == n - 1) solve(splitAts);
        else {
            splitAts[i] = false;
            dfs(i + 1);
            splitAts[i] = true;
            dfs(i + 1);
        }
    }

    void solve(boolean[] arr) {
        int current = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i]) {
//                debug("sub", s.substring(current, i + 1));
                sum += Long.parseLong(s.substring(current, i + 1));
                current = i + 1;
            }
//            debug(sum);
        }
        sum += Long.parseLong(s.substring(current, n));
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }

}

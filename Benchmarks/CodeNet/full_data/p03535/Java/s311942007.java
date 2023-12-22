
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    int n;
    int[] ds;
    int[] cnts = new int[13];
    boolean[] ts = new boolean[24];
    int ans = -1;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ds = new int[n];
        cnts[0]++;
        for (int i = 0 ; i < n; i++) {
            ds[i] = sc.nextInt();
            cnts[ds[i]]++;
        }
    }

    private void solve() {
        ts[0] = true;
        int mx = Arrays.stream(cnts).max().getAsInt();
        if (mx >= 3 || cnts[0] >= 2) {
            System.out.println(0);
            return;
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (cnts[ds[i]] == 2) {
                ts[ds[i] % 24] = true;
                ts[(24 - ds[i]) % 24] = true;
            }
            else {
                ls.add(ds[i]);
            }
        }
        int[] as = new int[ls.size()];
        for (int i = 0; i < as.length; i++)
            as[i] = ls.get(i);
        dfs(0, as);
        System.out.println(ans);

    }

    private void dfs(int i, int[] as) {
        if (i == as.length) {
            calc();
            return;
        }
        ts[as[i] % 24] = true;
        dfs(i+1, as);
        ts[as[i] % 24] = false;
        ts[(24 - as[i]) % 24] = true;
        dfs(i+1, as);
        ts[(24 - as[i]) % 24] = false;
    }

    private void calc() {
        int mn = 13;
        int old = 0;
        for (int i = 1; i < ts.length; i++) {
            if (!ts[i])
                continue;
            mn = Math.min(mn, i - old);
            old = i;
        }
        mn = Math.min(mn, 24 - old);
        ans = Math.max(ans, mn);
    }
}

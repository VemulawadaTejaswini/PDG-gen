import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] dp = new int[n];

    List<Integer>[] lists = new ArrayList[n];

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<n; i++) lists[i] = new ArrayList<>();
        for (int i=0; i<m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            lists[x].add(y);
        }

        Arrays.fill(dp, -1);

        int ret = 0;
        for (int i=0; i<n; i++) ret = Math.max(ret, rec(i));

        System.out.println(ret);

//        for (int i=0; i<n; i++) System.out.println(dp[i]);

    }

    int rec(int v) {
        if (dp[v] != -1) return dp[v];

        int ret = 0;
        for (int nv: lists[v]) {
            ret = Math.max(ret, rec(nv) + 1);
        }
        dp[v] = ret;
        return dp[v];
    }
}


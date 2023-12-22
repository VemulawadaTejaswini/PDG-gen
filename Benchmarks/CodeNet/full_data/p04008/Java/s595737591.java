import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Test {
    private static int k;
    private static List<List<Integer>> vec;

    public static void main(String args[]) {
        List<Integer> a = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();

        vec = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            vec.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt() - 1);
            if (i != 0) {
                vec.get(a.get(i)).add(i);
            }
        }

        int ans = 0;
        if (a.get(0) != 0) {
            ans++;
            a.set(0, 0);
        }
        ans += dfs(0, 0);

        System.out.println(ans);
    }

    private static int dfs(int i, int now) {
        int memo = 0;

        if (now == k + 1) {
            memo++;
            now = 1;
        }

        for (int v : vec.get(i)) {
            memo += dfs(v, now + 1);
        }

        return memo;
    }
}

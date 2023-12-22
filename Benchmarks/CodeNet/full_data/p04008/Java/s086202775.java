import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int k;
    private static List<List<Integer>> as;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();

        as = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            as.add(new ArrayList<>());
        }

        int a0 = -1;
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt() - 1;
            if (i == 0) {
                a0 = j;
            } else {
                as.get(j).add(i);
            }
        }

        int ans = 0;
        if (0 < a0) {
            ans++;
        }
        ans += dfs(0, 0);

        System.out.println(ans);
    }

    private static int dfs(int a, int count) {
        int r = 0;

        if (count == k + 1) {
            count = 1;
            r++;
        }

        for (int v : as.get(a)) {
            r += dfs(v, count + 1);
        }

        return r;
    }
}

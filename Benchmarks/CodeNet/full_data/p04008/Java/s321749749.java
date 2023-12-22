import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int K;
    private static List<List<Integer>> vec;
    private static int ans;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        K = sc.nextInt();
        ans = 0;
        vec = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vec.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() - 1;
            if (i != 0) {
                (vec.get(a)).add(i);
            } else if (a != 0) {
                ans++;
            }
        }
        dfs(0, 0);
        
        System.out.println(ans);
    }

    private static int dfs(int v, int pre) {
        int height = 0;
        for (int j = 0; j < (vec.get(v)).size(); j++) {
            height = Math.max(height, dfs((vec.get(v)).get(j), v));
        }
        if (pre != 0 && height == K - 1) {
            height = 0;
            ans++;
        } else {
            height++;
        }
        return height;
    }
}
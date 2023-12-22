import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static long k;
    private static List<List<Long>> vec = new ArrayList<>();
    private static long ans = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextLong();
        for (int i = 0; i < n; i++) {
            vec.add(new ArrayList<>());
        }
        for (long i = 0; i < n; i++) {
            int a = sc.nextInt() - 1;
            if (i != 0) {
                vec.get(a).add(i);
            } else if (a != 0) {
                ans++;
            }
        }
        dfs(0, 0);
        System.out.println(ans);
    }

    private static long dfs(long v, long pre) {
        long height = 0;
        for (long j : vec.get((int) v)) {
            height = Math.max(height, dfs(j, v));
        }
        if (pre != 0 && height == k - 1) {
            height = 0;
            ans++;
        } else {
            height++;
        }
        return height;
    }
}
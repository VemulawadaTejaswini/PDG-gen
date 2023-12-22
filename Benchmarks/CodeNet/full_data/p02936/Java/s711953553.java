import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    private static void dfs(int from, int to, long[] nodes, List<List<Integer>> list) {
        nodes[to] += nodes[from];
        for (int next : list.get(to)) {
            if (next == from) {
                continue;
            }
            dfs(to, next, nodes, list);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        int[] p = new int[q];
        int[] x = new int[q];
        long[] nodes = new long[n + 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            p[i] = sc.nextInt();
            x[i] = sc.nextInt();
            nodes[p[i]] += x[i];
        }

        List<List<Integer>> list = new ArrayList<>(n);
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            List<Integer> la = list.get(a[i]);
            la.add(b[i]);
            list.set(a[i], la);
            List<Integer> lb = list.get(b[i]);
            lb.add(a[i]);
            list.set(b[i], lb);
        }

        dfs(0, 1, nodes, list);

        StringJoiner sj = new StringJoiner(" ");
        for (int i = 1; i <= n; i++) {
            sj.add(String.valueOf(nodes[i]));
        }
        System.out.println(sj.toString());
    }

}

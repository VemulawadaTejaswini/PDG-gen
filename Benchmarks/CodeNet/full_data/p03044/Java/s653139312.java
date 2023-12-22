import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<List<Pair>> t = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            t.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            t.get(Integer.parseInt(sc.next()) - 1).add(new Pair(Integer.parseInt(sc.next()) - 1, Integer.parseInt(sc.next())));
        }

        int[] result = new int[n];
        boolean[] visited = new boolean[n];

        dfs(0, visited, t, result);

        for (int i : result) {
            System.out.println(i);
        }
    }

    private static void dfs(int pos, boolean[] visited, List<List<Pair>> tree, int[] result) {
        visited[pos] = true;
        for (Pair p : tree.get(pos)) {
            if (!visited[p.v]) {
                result[p.v] = p.w % 2;
                dfs(p.v, visited, tree, result);
            }
        }
    }

    public static class Pair {
        int v;
        int w;

        public Pair(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
}

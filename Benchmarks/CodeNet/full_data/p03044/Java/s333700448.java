
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Set<Integer>> diffs = new HashMap<>();
        for (int i = 0; i < n - 1; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            long w = scanner.nextLong();
            if (w % 2 == 1) {
                // u v different
                Set<Integer> diffForU = diffs.getOrDefault(u, new HashSet<>());
                diffForU.add(v);
                diffs.put(u, diffForU);
                Set<Integer> diffForV = diffs.getOrDefault(v, new HashSet<>());
                diffForV.add(u);
                diffs.put(v, diffForV);
            }
        }

        Set<Integer> uncolors = new HashSet<>();
        int [] colors = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            colors[i] = -1;
            uncolors.add(i);
        }

        while (!uncolors.isEmpty()) {
            int current = uncolors.iterator().next();
            colors[current] = 0;
            dfs(current, colors, diffs, uncolors);
        }
        for (int i = 1; i <= n; ++i) {
            System.out.println(colors[i]);
        }

    }
    public static void dfs(
            int current, int[] colors, Map<Integer, Set<Integer>> diffs,
            Set<Integer> uncolors

    ) {
      //  System.out.println("current: " + current + " color: " + colors[current]);
        uncolors.remove(current);
        Set<Integer> diff = diffs.getOrDefault(current, new HashSet<>());
        for (Integer diffNode : diff) {
            if (colors[diffNode] == -1) {
                colors[diffNode] = 1 - colors[current];
                uncolors.remove(diffNode);
                dfs(diffNode, colors, diffs, uncolors);
            }
        }
    }
}

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static class Node {
        int val;
        int to;

        public Node(int val, int to) {
            this.val = val;
            this.to = to;
        }
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        Map<Integer, Set<Integer>> edges = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (!edges.containsKey(q[0])) {
                edges.put(q[0], new HashSet<>());
            }
            edges.get(q[0]).add(q[1]);
            if (!edges.containsKey(q[1])) {
                edges.put(q[1], new HashSet<>());
            }
            edges.get(q[1]).add(q[0]);
        }
        TreeSet<Integer> rem = new TreeSet<>();
        for (int i = 1; i <= N; i++) {
            rem.add(i);
        }
        int ans = 0;
        while (!rem.isEmpty()) {
            ans++;
            int s = rem.first();
            dfs(edges, s, rem);
        }
        System.out.println(ans);
    }

    static void dfs(Map<Integer, Set<Integer>> edges, int s, Set<Integer> rem) {
        if (!rem.contains(s)) {
            return;
        }
        rem.remove(s);
        for (int n: edges.getOrDefault(s, Collections.emptySet())) {
            dfs(edges, n, rem);
        }
    }

}
import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        scanner.nextLine();
        int[][] edges = new int[N - 1][2];
        Map<Integer, Map<Integer, Integer>> color = new HashMap<>();
        int[] deg = new int[N + 1];
        for (int i = 0; i < N - 1; i++) {
            edges[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            deg[edges[i][0]]++;
            deg[edges[i][1]]++;
            if (!color.containsKey(edges[i][0])) {
                color.put(edges[i][0], new HashMap<>());
            }
            color.get(edges[i][0]).put(edges[i][1], 0);

            if (!color.containsKey(edges[i][1])) {
                color.put(edges[i][1], new HashMap<>());
            }
            color.get(edges[i][1]).put(edges[i][0], 0);
        }

        int max = Arrays.stream(deg).max().orElse(-1);

        System.out.println(max);
        for (int i = 1; i <= N; i++) {
            TreeSet<Integer> unused = new TreeSet<>();
            for (int j = 1; j <= max; j++) {
                unused.add(j);
            }
            for (int to : color.getOrDefault(i, Collections.emptyMap()).keySet()) {
                int c = color.get(i).get(to);
                if (c != 0) {
                    unused.remove(c);
                    continue;
                }
                color.get(i).put(to, unused.first());
                color.get(to).put(i, unused.first());
                unused.remove(unused.first());
            }
        }

        for (int[] e : edges) {
            System.out.println(color.get(e[0]).get(e[1]));
        }
    }

}


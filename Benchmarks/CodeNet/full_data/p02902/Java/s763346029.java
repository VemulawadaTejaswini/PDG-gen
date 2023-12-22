import java.util.*;
import java.util.stream.Collectors;

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

    static List<Integer>[] edges;
    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        edges = new List[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int s = Integer.parseInt(scanner.next()) - 1;
            int t = Integer.parseInt(scanner.next()) - 1;
            edges[s].add(t);
        }


        List<Integer> min = Collections.emptyList();
        for (int i = 0; i < N; i++) {
            minPath = Collections.emptyList();
            backtrack(i, new LinkedHashSet<>());
            if (min.isEmpty()) {
                min = minPath;
                continue;
            }
            if (!minPath.isEmpty() && minPath.size() < min.size())
                min = minPath;
        }

        if (min.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(min.size());
            for (int n : min) {
                System.out.println(n + 1);
            }
        }
    }

    static List<Integer> minPath;
    static void backtrack(int curr, LinkedHashSet<Integer> processing) {
        if (processing.add(curr)) {
            for (int next: edges[curr]) {
                backtrack(next, processing);
            }
            processing.remove(curr);
        } else {
            List<Integer> path = new ArrayList<>(processing);
            if (minPath.isEmpty() || minPath.size() > path.size()) {
                minPath = path;
            }
        }
    }
}

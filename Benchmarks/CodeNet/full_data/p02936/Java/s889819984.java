import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), Q = scanner.nextInt();
        scanner.nextLine();
        Map<Integer, Set<Integer>> edges = new HashMap<>();
        for (int i = 0; i < N; i++) {
            edges.put(i + 1, new HashSet<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            edges.get(e[0]).add(e[1]);
        }

        int[] sum = new int[N + 1];
        for (int i = 0; i < Q; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sum[q[0]] += q[1];
        }


        Queue<Long> q = new ArrayDeque<>();
        q.add(1L);
        while (!q.isEmpty()) {
            long l = q.poll();
            int parent = (int) (l >> 32);
            int curr = (int) l;
            sum[curr] += sum[parent];
            for (int next: edges.get(curr)) {
                q.add((((long) curr) << 32) + next);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(sum[i]);
            sb.append(' ');
        }
        System.out.println(sb.toString().trim());
    }

}

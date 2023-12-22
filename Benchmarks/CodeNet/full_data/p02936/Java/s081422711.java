import java.util.*;

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
            edges.get(e[1]).add(e[0]);
        }

        int[] sum = new int[N + 1];
        for (int i = 0; i < Q; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sum[q[0]] += q[1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int ans = sum[i];
            Set<Integer> es = edges.get(i);
            while (!es.isEmpty()) {
                Set<Integer> nes = new HashSet<>();
                for (int e: es) {
                    ans += sum[e];
                    nes.addAll(edges.get(e));
                }
                es = nes;
            }
            sb.append(ans);
            sb.append(' ');
        }
        System.out.println(sb.toString().trim());
    }

}

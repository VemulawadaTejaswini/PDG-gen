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
    // long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        long[][] c = new long[N][2];
        for (int i = 0; i < N; i++) {
            c[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        }
        int div = 1;
        for (int i = 2; i <= N; i++) {
            div *= i;
        }
        double total = dfs(new LinkedHashSet<>(), c, N);
        System.out.println(total / div);
    }


    static double dfs(LinkedHashSet<Integer> visited, long[][] c, int N) {
        if (visited.size() == N) {
            List<Integer> order = new ArrayList<>(visited);
            double sum = 0;
            for (int i = 1; i < visited.size(); i++) {
                long x = c[order.get(i - 1)][0] - c[order.get(i)][0];
                long y = c[order.get(i - 1)][1] - c[order.get(i)][1];
                sum += Math.sqrt(x * x + y * y);
            }
            return sum;
        }

        double total = 0;
        for (int i = 0; i < N; i++) {
            if (!visited.contains(i)) {
                visited.add(i);
                total += dfs(visited, c, N);
                visited.remove(i);
            }
        }
        return total;
    }

}

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
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        List<List<Integer>> pay = new ArrayList<>();
        for (int i = 0; i <= M; i++) {
            pay.add(new ArrayList<>());
        }
        for (int i = 0; i < N; i++) {
            int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (n[0] <= M) {
                pay.get(n[0]).add(n[1]);
            }
        }

        int ans = 0;
        Queue<Integer> q = new PriorityQueue<>(Comparator.comparingInt(x -> -x));
        for (int i = 1; i <= M; i++) {
            q.addAll(pay.get(i));
            if (!q.isEmpty()) {
                ans += q.poll();
            }
        }
        System.out.println(ans);
    }

}

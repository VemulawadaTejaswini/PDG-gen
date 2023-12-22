import java.util.*;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }



    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Queue<Integer> q = new PriorityQueue<>(Comparator.comparingInt(x -> -x));
        for (int n: a) {
            q.add(n);
        }

        for (int i = 0; i < M; i++) {
            q.add(q.poll() / 2);
        }

        long ans = 0;
        while (!q.isEmpty()) {
            ans = ans + q.poll();
        }

        System.out.println(ans);
    }

}

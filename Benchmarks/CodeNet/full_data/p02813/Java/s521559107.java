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
        N = Integer.parseInt(scanner.next());
        P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(scanner.next());
        }
        Q = new int[N];
        for (int i = 0; i < N; i++) {
            Q[i] = Integer.parseInt(scanner.next());
        }

        permuteAndProcess(new LinkedHashSet<>());
        assert (A > 0);
        assert (B > 0);
        System.out.println(Math.abs(A - B));
    }

    static int[] P, Q;
    static int N, A = -1, B = -1;
    static int curr = 0;
    static void permuteAndProcess(LinkedHashSet<Integer> visited) {
        if (visited.size() == N) {
            curr++;
            List<Integer> order = new ArrayList<>(visited);
            boolean f = true;
            for (int i = 0; i < N; i++) {
                if (order.get(i) + 1 != P[i]) {
                    f = false;
                }
            }
            if (f) {
                A = curr;
            }

            for (int i = 0; i < N; i++) {
                if (order.get(i) + 1 != Q[i]) {
                    return;
                }
            }
            B = curr;
        }

        for (int i = 0; i < N; i++) {
            if (!visited.contains(i)) {
                visited.add(i);
                permuteAndProcess(visited);
                visited.remove(i);
            }
        }
    }
}


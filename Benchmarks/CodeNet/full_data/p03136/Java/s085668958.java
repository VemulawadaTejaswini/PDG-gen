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
        int N = Integer.parseInt(scanner.next());
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = Integer.parseInt(scanner.next());
        }
        int total = Arrays.stream(L).sum();
        int max = Arrays.stream(L).max().orElse(0);
        System.out.println(total - max > max ? "Yes" : "No");


    }
}


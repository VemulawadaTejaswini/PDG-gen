import java.util.Scanner;
import java.util.TreeMap;

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
        int K = Integer.parseInt(scanner.next());
        int Q = Integer.parseInt(scanner.next());
        int[] score = new int[N];
        for (int i = 0; i < Q; i++) {
            int n = Integer.parseInt(scanner.next()) - 1;
            score[n]++;
        }

        for (int i = 0; i < N; i++) {
            if (K - Q + score[i] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}


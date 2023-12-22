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
        int[][] c = new int[10][10];
        for (int i = 1; i <= N; i++) {
            int s = i;
            while (s > 9) s /= 10;
            int e = i % 10;
            c[s][e]++;
        }

        int ans = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ans += c[i][j] * c[j][i];
            }
        }

        System.out.println(ans);
    }

}

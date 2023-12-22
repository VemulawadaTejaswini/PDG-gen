import java.util.Scanner;

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

    static int N;
    static void solve(Scanner scanner) {
        String s = scanner.next();
        int digit = s.length();
        N = Integer.parseInt(s);
        dfs(0, digit, false, false, false);
        System.out.println(ans);
    }

    static int ans = 0;
    private static void dfs(long curr, int digit, boolean b3, boolean b5, boolean b7) {
        if (curr <= N && b3 && b5 && b7) {
            ans++;
        }
        if (digit == 0) {
            return;
        }
        dfs(curr * 10 + 3, digit - 1, true, b5, b7);
        dfs(curr * 10 + 5, digit - 1, b3, true, b7);
        dfs(curr * 10 + 7, digit - 1, b3, b5, true);
    }

}

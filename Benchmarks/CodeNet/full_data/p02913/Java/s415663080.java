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
        String s = scanner.next();

        Set<String> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                set.add(sub);
            }
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (set.contains(sub)) {
                    max = Math.max(max, sub.length());
                }
            }
        }

        System.out.println(max);
    }
}


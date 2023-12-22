import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    static void solve(Scanner scanner) {
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int Q = a[1];
        String s = scanner.nextLine();
        int[] cnt = new int[s.length()];
        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            cnt[i] += cnt[i - 1];
            if (prev == 'A') {
                if (s.charAt(i) == 'C') {
                    cnt[i]++;
                }
            }
            prev = s.charAt(i);
        }

        for (int i = 0; i < Q; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(cnt[q[1] - 1] - cnt[q[0] - 1]);
        }
    }

}
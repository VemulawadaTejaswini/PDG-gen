import java.util.Arrays;
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

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            sb.append(cnt[c - 1] - cnt[b - 1]);
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
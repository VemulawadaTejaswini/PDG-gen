import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
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
        int M = scanner.nextInt();
        scanner.nextLine();

        int[] map = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};
        long ans = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < M; i++) {
            long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
            int d = (int) n[0];
            long c = n[1];

            if (c == 1) {
                deque.addLast(d);
                continue;
            }

            long cnt = 0;
            while (c > 1) {
                if (c % 2 == 1) {
                    deque.addLast(d);
                }

                cnt += c / 2;
                if (d >= 5) {
                    cnt += c / 2;
                }
                d = map[d];
                c /= 2;
            }

            deque.addLast(d);
            ans += cnt;
        }

        while (!deque.isEmpty()) {
            int first = deque.pollFirst();
            if (deque.isEmpty()) {
                break;
            }
            int second = deque.pollFirst();
            int res = first + second;
            if (res >= 10) {
                deque.addFirst(1 + (res % 10));
                ans += 2;
            } else {
                deque.addFirst(res % 10);
                ans++;
            }
        }

        System.out.println(ans);

    }

}


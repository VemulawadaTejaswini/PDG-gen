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
        int M = Integer.parseInt(scanner.next());
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < N; i++) {
            q.add(Integer.parseInt(scanner.next()));
        }
        while (M > 0) {
            q.add(q.poll() / 2);
            M--;
        }
        System.out.println(q.stream().mapToLong(x -> x).sum());
    }
}


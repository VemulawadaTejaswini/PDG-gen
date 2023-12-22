import java.nio.file.FileSystemLoopException;
import java.text.DecimalFormat;
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

    static class P {
        int x;
        int y;

        public P(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            P p = (P) o;
            return x == p.x &&
                    y == p.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        for (int i = 0; i < N / 2; i++) {
            int key = Integer.parseInt(scanner.next());
            m1.put(key, m1.getOrDefault(key, 0) + 1);
            key = Integer.parseInt(scanner.next());
            m2.put(key, m2.getOrDefault(key, 0) + 1);
        }

        Map.Entry<Integer, Integer> m1Max = m1.entrySet().stream().max((x, y) -> y.getValue() - x.getValue()).orElse(new AbstractMap.SimpleEntry<>(0, 0));
        m1.remove(m1Max.getKey());
        Map.Entry<Integer, Integer> m1Max2 = m1.entrySet().stream().max((x, y) -> y.getValue() - x.getValue()).orElse(new AbstractMap.SimpleEntry<>(0, 0));

        Map.Entry<Integer, Integer> m2Max = m2.entrySet().stream().max((x, y) -> y.getValue() - x.getValue()).orElse(new AbstractMap.SimpleEntry<>(0, 0));
        m2.remove(m2Max.getKey());
        Map.Entry<Integer, Integer> m2Max2 = m2.entrySet().stream().max((x, y) -> y.getValue() - x.getValue()).orElse(new AbstractMap.SimpleEntry<>(0, 0));

        int ans = Integer.MAX_VALUE;
        if (!m1Max.getKey().equals(m2Max.getKey())) {
            ans = Math.min(ans, N - m1Max.getValue() - m2Max.getValue());
        }
        if (!m1Max.getKey().equals(m2Max2.getKey())) {
            ans = Math.min(ans, N - m1Max.getValue() - m2Max2.getValue());
        }
        if (!m1Max2.getKey().equals(m2Max.getKey())) {
            ans = Math.min(ans, N - m1Max2.getValue() - m2Max.getValue());
        }

        System.out.println(ans);
    }

}

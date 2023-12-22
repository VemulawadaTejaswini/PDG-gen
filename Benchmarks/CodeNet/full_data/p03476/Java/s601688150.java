import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static class Period {
        int s;
        int e;

        public Period(int s, int e) {
            this.s = s;
            this.e = e;
        }
    }

    static void solve(Scanner scanner) {
        boolean[] prime = new boolean[100_001];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < 100_001; i++) {
            if (!prime[i]) {
                continue;
            }
            for (int j = 2 * i; j < 100_001; j+=i) {
                prime[j] = false;
            }
        }

        Bit bit = new Bit(100_000);
        for (int i = 2; i < 100_000; i++) {
            if (prime[i] && prime[(i + 1) / 2]) {
                bit.add(i, 1);
            }
        }

        int Q = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < Q; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(bit.sum(q[1]) - bit.sum(q[0] - 1));
        }
    }

    static class Bit {
        int[] bit;
        int n;

        Bit(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        void add(int i, int x) {
            bit[i] += x;
            while (i + (i & -i) <= n) {
                i += (i & -i);
                bit[i] += x;
            }
        }

        int sum(int i) {
            int sum = bit[i];
            while (i - (i & -i) > 0) {
                i -= (i & -i);
                sum += bit[i];
            }
            return sum;
        }
    }
}
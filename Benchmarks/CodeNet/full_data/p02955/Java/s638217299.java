import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;
    public static final PrintStream err = System.err;

    public static void main(String[] args) {
        int N = in.nextInt();
        int K = in.nextInt();
        int[] A = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i] = in.nextInt();
        }

        err.println(sum);

        Set<Integer> P = new TreeSet<>();
        for (int i = 1; i * i <= sum; i ++) {
            if (sum % i == 0) {
                P.add(sum / i);
                P.add(i);
            }
        }

        int result = 1;
        for (int p : P) {
            int[] r = new int[N];
            int rs = 0;
            for (int i = 0; i < N; i++) {
                rs += r[i] = A[i] % p;
            }

            Arrays.sort(r);
            int ls = 0, s = rs;
            for (int i = N - 1; 0 <= i ; i--) {
                if (r[i] == 0) {
                    continue;
                }
                ls += p - r[i];
                s -= r[i];
                if (ls == s) {
                    break;
                }
            }

            err.printf("p: %d, r: %s, rs: %d, ls: %d, s: %d%n", p, Arrays.toString(r), rs, ls, s);

            if (s <= K) {
                result = Math.max(result, p);
            }
        }

        out.println(result);
    }
}

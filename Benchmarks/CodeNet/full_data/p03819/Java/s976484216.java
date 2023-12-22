
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.function.LongConsumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int L[] = new int[3 * 100000 + 1];
        int R[] = new int[3 * 100000 + 1];
        int N = in.nextInt();
        int M = in.nextInt();

        range(N).forEach((int i) -> {
            L[i] = in.nextInt();
            R[i] = in.nextInt();
        });

        for (int i = 1 ; i <= M; i++) {
            int match = 0;

            for (int j = 0; j < N; j++) {
                int l = L[j];
                int r = R[j];

                int ld = l / i;
                int lm = l % i;
                int rd = r / i;
                int rm = r % i;

                if (lm == 0 || rm == 0 ||
                        ld != rd) {
                    match ++;
                }
            }

            out.println(match);
        }
    }
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;
    public static LongStream range(long max) {
        return LongStream.iterate(0L, i -> i + 1).limit(max);
    }
    public static IntStream range(int max) {
        return IntStream.iterate(0, i -> i + 1).limit(max);
    }
}

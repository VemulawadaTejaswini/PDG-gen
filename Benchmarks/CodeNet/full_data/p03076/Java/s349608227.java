import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static final long M = 998_244_353;

    // 13:29-
    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            int[] times = new int[5];
            int[] actual = new int[5];
            int maxDiff = Integer.MIN_VALUE;
            int diffPos = -1;
            for (int i = 0; i < 5; i++) {
                int x = sc.nextInt();
                actual[i] = x;
                int sum = 0;
                sum += x / 10 * 10;
                if (x % 10 > 0) sum += 10;
                times[i] = sum;
                int diff = sum - x;
                if (diff > maxDiff) {
                    maxDiff = diff;
                    diffPos = i;
                }
            }

            int total = 0;
            for (int i = 0; i < times.length; i++) if (i != diffPos) total += times[i];

            out.println(total + actual[diffPos]);
        }
    }
}

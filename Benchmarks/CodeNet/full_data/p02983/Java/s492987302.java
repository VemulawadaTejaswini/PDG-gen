import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        try (Scanner scanner = new Scanner(System.in)){
            long[] in = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
            long l = in[0];
            long r = in[1];
            int mod = 2019;

            if (r - l > mod) {
                System.out.println(0);
                return;
            }
            long[] x = new long[mod + 1];
            int length = 0;

            for (long i = l; i < r; i++) {
                x[length++] = i % mod;
            }
            long min = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++){
                    long m = (x[i] * x[j]) % mod;

                    if (m < min) min = m;
                    if (min == 0) break;
                }
            }

            System.out.println(min);
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long N = in.nextInt();
            long K = in.nextInt();

            long count = 0;
            for (long a = 1; a <= N; a++) {
                {
                    long b = (K * a - a) % K;
                    if (b == 0) {
                        b = K;
                    }
                    long c = (K * b - b) % K;
                    if (c == 0) {
                        c = K;
                    }
                    if ((c + a) % K != 0) {
                        continue;
                    }
                    count += ((N - b) / K + 1) * ((N - c) / K + 1);
                }
            }

            System.out.println(count);
        }
    }
}

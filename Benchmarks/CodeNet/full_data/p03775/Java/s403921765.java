import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long N = in.nextLong();

            long min = (long) 1e18;
            long sqrt = (long) Math.sqrt(N) + 10;
            for (long A = 1; A < sqrt; A++) {
                if (N % A != 0) {
                    continue;
                }
                long B = N / A;

                min = Math.min(min, F("" + A, "" + B));
            }

            System.out.println(min);
        }
    }

    private static long F(String a, String b) {
        return Math.max(a.length(), b.length());
    }
}

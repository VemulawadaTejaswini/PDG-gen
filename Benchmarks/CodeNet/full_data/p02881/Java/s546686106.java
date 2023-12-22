import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long min = Long.MAX_VALUE;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                min = Math.min(min, i + (n / i) - 2);
            }
        }
        System.out.println(min);
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

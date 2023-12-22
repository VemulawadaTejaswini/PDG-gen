import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        long[] x = new long[5];
        long nn = sc.nextLong();
        long n = nn;
        x[0] = sc.nextLong();
        x[1] = sc.nextLong();
        x[2] = sc.nextLong();
        x[3] = sc.nextLong();
        x[4] = sc.nextLong();

        long[] y = new long[5];

        long count = 0;
        while (y[4] != nn) {
            for (int i = 4; i > 0; i--) {
                if (y[i-1] > x[i]) {
                    y[i-1] -= x[i];
                    y[i] += x[i];
                } else if (y[i-1] > 0 && y[i-1] < x[i]) {
                    y[i] += y[i-1];
                    y[i-1] = 0;
                }
            }
            if (n > x[0]) {
                n -= x[0];
                y[0] += x[0];
            } else if (n > 0 && n < x[0]) {
                y[0] += n;
                n = 0;
            }
            count++;
        }
        System.out.println(count);
    }
}

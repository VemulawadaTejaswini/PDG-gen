
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Y = scanner.nextInt();

        int sum1, sum2, sum3;
        for (int s=N; s >= 0; s--) {
            // 10,000
            sum1 = 10000 * s;
            for (int t=N - s; t >= 0; t--) {
                // 5,000
                sum2 = 5000 * t;
                for (int u=N - s - t; u >= 0; u--) {
                    // 1,000
                    sum3 = 1000 * u;
                    if (s + t + u == N) {
                        if (sum1 + sum2 + sum3 == Y) {
                            System.out.printf("%d %d %d\n", s, t, u);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}

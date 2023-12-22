
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] d = new int[n + 1];
        d[0] = 0;
        for (int i = 1; i <= n; ++i) {
            d[i] = scanner.nextInt();
        }
        Arrays.sort(d);
        for (int i = 0; i <= n; ++i) {
            if (i % 2 == 0) {
                d[i] = 24 - d[i];
            }
        }
        int min = 24;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                int diff = Math.abs(d[i] - d[j]);
                int current = Math.min(24 - diff, diff);
                min = Math.min(min, current);
            }
        }

        System.out.println(min);
    }
}

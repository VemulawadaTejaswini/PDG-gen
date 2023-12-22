
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
            if (i % 2 == 1) {
                d[i] = 24 - d[i];
            }
        }
        int min = 24;
        for (int i = 0; i < n; ++i) {
            int diff = Math.abs(d[i] - d[i + 1]);
            int current = Math.min(24 - diff, diff);
            min = Math.min(min, current);

        }
        System.out.println(min);
    }
}

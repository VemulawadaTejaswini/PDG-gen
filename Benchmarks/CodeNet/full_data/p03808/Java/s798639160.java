import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        long m = (long)n * (n + 1) / 2;
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        if (sum % m == 0) {
            long[] b = new long[n];
            b[0] = a[n - 1] - a[0] + sum / m;
            for (int i = 1; i < n; i++) {
                b[i] = a[i - 1] - a[i] + sum / m;
            }
            System.out.println(Arrays.toString(b));
            for (int i = 0; i < n; i++) {
                if (b[i] < 0 || b[i] % n != 0) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
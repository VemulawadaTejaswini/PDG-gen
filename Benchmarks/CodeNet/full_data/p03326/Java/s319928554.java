import java.util.Arrays;
import java.util.Scanner;

class D {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final long[] x = new long[N];
        final long[] y = new long[N];
        final long[] z = new long[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }
        long max = 0;
        final long[] a = new long[N];
        for (int i = 1; i >= -1; i -= 2)
            for (int j = 1; j >= -1; j -= 2)
                for (int k = 1; k >= -1; k -= 2) {
                    for (int l = 0; l < N; l++)
                        a[l] = x[l] * i + y[l] * j + z[l] * k;
                    Arrays.sort(a);
                    long sum = 0;
                    for (int l = N - 1; l >= N - M; l--)
                        sum += a[l];
                    max = Math.max(max, sum);
                }
        System.out.println(max);
    }
}
public class Main {
    public static void main(String...args) {
        D.main();
    }
}
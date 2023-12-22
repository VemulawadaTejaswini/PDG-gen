import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] b = new int[n - 1];
        for (int i = 0; i < b.length; i++) {
            b[i] = std.nextInt();
        }

        int[] c = new int[n + 1];
        c[0] = Integer.MAX_VALUE;
        c[n] = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            c[i] = b[i - 1];
        }

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.min(c[i], c[i + 1]);
        }

        System.out.println(Arrays.stream(a).sum());
    }
}

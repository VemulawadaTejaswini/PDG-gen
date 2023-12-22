import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);

        int b = a[0], c = a[n - 1];
        int l = 1, r = n - 2;
        long v = c - b;
        while (l <= r) {
            int[] w = {Math.abs(b - a[l]), Math.abs(b - a[r]), Math.abs(c - a[l]), Math.abs(c - a[r]), 0};
            int m = Arrays.stream(w).max().getAsInt();
            v += m;
            if (m == w[0]) {
                b = a[l++];
            } else if (m == w[1]) {
                b = a[r--];
            } else if (m == w[2]) {
                c = a[l++];
            } else if (m == w[3]) {
                c = a[r--];
            }
        }
        System.out.println(v);
    }
}
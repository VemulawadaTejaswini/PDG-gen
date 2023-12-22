import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        r[] a = new r[n];
        for (int i = 0; i < n; i++) {
            a[i] = new r();
            a[i].s = scanner.next();
            a[i].p = scanner.nextInt();
            a[i].i = i + 1;
        }

        Arrays.sort(a, Comparator.<r, String>comparing(ar -> ar.s).reversed().thenComparingInt(ar -> ar.p).reversed());

        for (r r : a) {
            System.out.println(r.i);
        }
    }

    static class r {
        String s;
        int p;
        int i;
    }
}
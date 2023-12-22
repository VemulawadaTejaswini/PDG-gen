import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long s = 0;
        long t = 0;
        long u = 0;
        long v = 0;
        for (int i = 0; i < n; i++) {
            s += Math.abs(a[i] - (a[0] + i));
            t += Math.abs(a[i] - (a[n - 1] - n + 1 + i));
            u += Math.abs(a[i] - (a[n - 1] + i));
            v += Math.abs(a[i] - (a[0] - n + 1 + i));
        }

        System.out.println(Math.min(s, Math.min(t, Math.min(u, v))));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}

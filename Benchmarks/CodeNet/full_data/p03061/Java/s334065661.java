import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] l = new int[n];
        int[] r = new int[n];
        l[0] = 0;
        r[n - 1] = 0;
        for (int i = 0; i < a.length - 1; i++) {
            l[i + 1] = gcd(l[i], a[i]);
            r[n - i - 2] = gcd(r[n - i - 1], a[n - i - 1]);
        }
        int max = gcd(l[0], r[0]);
        for (int i = 1; i < n; i++) {
            max = Math.max(max, gcd(l[i], r[i]));
        }
        System.out.println(max);
        sc.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
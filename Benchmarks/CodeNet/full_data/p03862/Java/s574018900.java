import java.util.Scanner;

public class Main {
    static int n;
    static long x;
    static long[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        a = new long[n];
        long ans = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            long diff = Math.max(0, a[i] + a[i+1] - x);
            if (diff > 0) {
                ans += diff;
                a[i+1] =- Math.min(a[i+1], diff);
            }
        }
        System.out.println(ans);
    }
}
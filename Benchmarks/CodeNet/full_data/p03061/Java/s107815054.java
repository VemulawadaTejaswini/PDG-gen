import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        sc.close();

        long ans = gcd(max, min);

        if (ans == 1) {
            max++;
        }
        ans = gcd(max, min);

        System.out.println(ans);
    }

    public static long gcd(long x, long y) {
        if (x < y)
            return gcd(y, x);
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

}
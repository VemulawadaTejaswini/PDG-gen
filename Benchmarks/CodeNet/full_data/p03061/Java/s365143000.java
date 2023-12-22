import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] ary = new long[n];
        long[] l = new long[n];
        long[] r = new long[n];
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(sc.next());
            ary[i] = a;
        }
        long temp = ary[0];
        l[0] = ary[0];
        for (int i = 0; i < n - 1; i++) {
            temp = getGcd(temp, ary[i + 1]);
            l[i + 1] = temp;
        }
        temp = ary[n - 1];
        r[n - 1] = ary[n - 1];
        for (int i = n - 1; i > 0; i--) {
            temp = getGcd(temp, ary[i - 1]);
            r[i - 1] = temp;
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans = Math.max(ans, r[1]);
            } else if (i == n - 1) {
                ans = Math.max(ans, l[n - 2]);
            } else {
                ans = Math.max(ans, getGcd(l[i - 1], r[i + 1]));
            }
        }
        System.out.println(ans);
    }

    private static long getGcd(long x, long y) {
        return y == 0 ? x : getGcd(y, x % y);
    }
}
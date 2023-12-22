import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        int[] x = new int[n + 1];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        x[n] = X;
        Arrays.sort(x);
        for (int i = 0; i < n; i++) {
            d[i] = x[i + 1] - x[i];
        }
        if (d.length == 1) {
            System.out.println(d[0]);
            System.exit(0);
        }
        int ans = gcd(d[0], d[1]);
        for (int i = 2; i < n; i++) {
            ans = gcd(ans, d[i]);
        }
        System.out.println(ans);
    }

    static int gcd(int x, int y) {
        if (y > x)
            return gcd(y, x);
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
}

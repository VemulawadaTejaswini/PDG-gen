import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = gcd(a[0], a[1]);
        for (int i = 2; i < n; i++) {
            t = gcd(t, a[i]);
        }
        System.out.println(t);
    }

    static int gcd(int x, int y) {
        if (x < y)
            return gcd(y, x);
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
}

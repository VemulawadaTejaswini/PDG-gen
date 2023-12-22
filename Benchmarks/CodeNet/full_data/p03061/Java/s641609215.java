import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            int l = 0, r = 0;
            for (int j = 0; j < i; j++) {
                l = gcd(l, a[j]);
            }
            for (int j = i + 1; j < a.length; j++) {
                r = gcd(r, a[j]);
            }
            result = Math.max(result, gcd(l, r));
        }
        System.out.println(result);
        sc.close();
    }

    static int gcd(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (min == 0) {
            return max;
        }
        return gcd(min, max % min);
    }
}
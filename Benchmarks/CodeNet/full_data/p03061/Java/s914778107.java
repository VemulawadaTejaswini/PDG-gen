import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int[] l = new int[n + 1];
        int[] r = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            l[i] = gcd(l[i - 1], a[i - 1]);
            r[n - i] = gcd(r[n + 1 - i], a[n - i]);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, gcd(l[i], r[i + 1]));
        }

        System.out.println(result);
    }

    private static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}

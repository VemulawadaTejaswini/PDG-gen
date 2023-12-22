import java.util.Scanner;

public class Main {
    static int n;
    static int x;
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
        for (int i = 1; i < n; i++) {
            long diff = a[i-1] + a[i] - x;
            if (diff > 0) {
                ans += diff;
                a[i] =- diff;
            }
        }
        System.out.println(ans);
    }
}
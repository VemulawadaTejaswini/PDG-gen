import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n + 1];
        long[] b = new long[n];
        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        long ans = 0l;
        for (int i = 0; i < n; i++) {
            long l = Math.min(a[i], b[i]);
            a[i] -= l;
            b[i] -= l;
            ans += l;
            long r = Math.min(a[i+1], b[i]);
            a[i+1] -= r;
            b[i] -= r;
            ans += r;
        }
        System.out.println(ans);
    }
}
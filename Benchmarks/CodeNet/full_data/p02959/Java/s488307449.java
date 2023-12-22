import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int left = Math.min(a[i], b[i]);
            sum += left;
            a[i] -= left;
            b[i] -= left;
            int right = Math.min(a[i + 1], b[i]);
            sum += right;
            a[i + 1] -= right;
            b[i] -= right;
        }
        System.out.println(sum);
    }
}
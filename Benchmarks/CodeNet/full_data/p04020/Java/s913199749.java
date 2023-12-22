import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            long asum = a[i] + a[i + 1];
            long d = asum / 2;
            sum += d;
            a[i + 1] -= Math.max(2 * d - a[i], 0);
        }
        System.out.println(sum);
    }

}

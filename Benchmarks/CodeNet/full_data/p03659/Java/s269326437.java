
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long tmp = sc.nextLong();
            a[i] = tmp;
            sum += tmp;
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            long tmp = 0;
            for (int j = 0; j <= i; j++) {
                tmp += a[j];
            }
            long tmp2 = sum - tmp;
            long tmp3 = Math.abs(tmp - tmp2);
            ans = Math.min(ans, tmp3);
        }
        System.out.println(ans);
    }
}
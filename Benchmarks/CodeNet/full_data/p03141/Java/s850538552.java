import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[][] ab = new long[n][2];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
            ab[i][0] = a[i] + b[i];
            ab[i][1] = i;
        }
        Arrays.sort(ab, Comparator.comparingLong(o -> o[0]));
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans += a[(int) ab[n - 1 - i][1]];
            } else {
                ans -= b[(int) ab[n - 1 - i][1]];
            }
        }
        System.out.println(ans);
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        int[] b = new int[m];
        long[] c = new long[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextLong();
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(a);
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (cnt >= b[i] || a[j] >= c[i]) {
                    break;
                }
                a[j] = c[i];
                cnt++;
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i];
        }
        System.out.println(ans);
    }

}

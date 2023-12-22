import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);
        int i = 0;
        long ans = 0;
        while (i < n) {
            long x = a[i];
            int j = 0;
            while (i + j < n && a[i + j] == x) {
                j++;
            }
            if (j > x) {
                ans += j - x;
            } else if (j < x) {
                ans += j;
            }
            i += j;
        }
        System.out.println(ans);
    }

}

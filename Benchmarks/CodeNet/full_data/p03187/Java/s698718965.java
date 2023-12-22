import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
//        long[] asum = new long[n + 1];
//        long sum1 = 0;
        int[] b = new int[n];
//        long[] bsum = new long[n + 1];
//        long sum2 = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            b[i] = l - a[i];
        }
        long answer = 0;
        for (int i = 0 ; i < n ; i++) {
            long ans = 0;
            int last =  (n + i) / 2;
            if ((n - i) % 2 == 0) {
                for (int j = i ; j <= last - 1 ; j++) {
                    ans += 2 * a[j];
                }
                for (int j = last + 1 ; j < n ; j++) {
                    ans += 2 * b[j];
                }
                ans +=  b[last];
            } else {
                for (int j = i ; j <= last - 1 ; j++) {
                    ans += 2 * a[j];
                }
                for (int j = last + 1 ; j < n ; j++) {
                    ans += 2 * b[j];
                }
                ans +=  a[last];
            }
            answer = Math.max(ans, answer);

        }
        for (int i = n - 1 ; i >= 0 ; i--) {
            long ans = 0;
            int last =  (n - i) / 2;
            if ((n - i) % 2 == 0) {
                for (int j = 0 ; j <= last - 1 ; j++) {
                    ans += 2 * a[j];
                }
                for (int j = last + 1 ; j <= i ; j++) {
                    ans += 2 * b[j];
                }
                ans +=  b[last];
            } else {
                for (int j = 0 ; j <= last - 1 ; j++) {
                    ans += 2 * a[j];
                }
                for (int j = last + 1 ; j <=i ; j++) {
                    ans += 2 * b[j];
                }
                ans +=  a[last];
            }
            answer = Math.max(ans, answer);

        }
        System.out.println(answer);
    }

}
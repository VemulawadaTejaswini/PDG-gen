import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        /*
         * if (a[n - 1] >= 0 && a[n - 2] <= 0) { for (int i = 0; i < n; i++) { ans +=
         * Math.abs(a[i]); } System.out.print(ans); for (int i = 1; i < n; i++) {
         * System.out.println(a[i] + " " + a[i - 1]); } return; }
         */

        int plus = 0;
        int minpos = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                plus++;
            }
            if (a[i] < 0) {
                minpos = i;
            }
        }

        long ans = a[0];
        for (int i = minpos + 1; i < n - 1; i++) {
            ans -= a[i];
        }
        for (int i = 0; i <= minpos; i++) {
            if (minpos == 0) {
                break;
            }
            ans -= a[i];
        }
        ans = a[n - 1] - ans;
        System.out.println(ans);

        long now = a[0];
        for (int i = minpos + 1; i < n - 1; i++) {
            System.out.println(now + " " + a[i]);
            ans -= a[i];
            now -= a[i];
        }
        for (int i = 0; i <= minpos; i++) {
            if (minpos == 0) {
                break;
            }
            System.out.println(now + " " + a[i]);
            ans -= a[i];
            now -= a[i];
        }
        System.out.println(a[n - 1] + " " + now);
    }
}

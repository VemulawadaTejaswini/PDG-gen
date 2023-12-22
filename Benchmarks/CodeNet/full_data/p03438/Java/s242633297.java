import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] sub = new int[n];
        int sum_a = 0, sum_b = 0;
        int num;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            sum_a += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(sc.next());
            sum_b += b[i];
            sub[i] += b[i] - a[i];
        }

        num = sum_b - sum_a;

        for (int i = 0; i < n; i++) {
            if (sub[i] > 0 && sub[i] % 2 == 0) {
                ans += sub[i] / 2;
            } else if (sub[i] > 0 && sub[i] % 2 == 1) {
                ans += sub[i] / 2 + 1;
            } else if (sub[i] < 0) {
                ans += -1 * sub[i];
            }
        }

        if (ans > num) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
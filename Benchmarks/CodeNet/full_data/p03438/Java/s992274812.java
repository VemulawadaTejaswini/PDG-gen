import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int sum_a = 0, sum_b = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            sum_a += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(sc.next());
            sum_b += b[i];
        }

        if (sum_a > sum_b) {
            System.out.println("No");
            return;
        }

        long opt = sum_b - sum_a;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            long diff = b[i] - a[i];
            if (diff > 0) {
                ans += (diff + 1) / 2;
            }
        }

        if (ans > opt) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        long limit = sc.nextLong();
        long a[] = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }

        int p = 1;
        int ans[] = new int[n - 1];
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (sum < limit) {
                System.out.println("Impossible");
                System.exit(0);
            }

            if (a[l] < a[r]) {
                sum -= a[l];
                ans[l] = p++;
                l++;
            } else {
                sum -= a[r];
                ans[r - 1] = p++;
                r--;
            }
        }

        System.out.println("Possible");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}

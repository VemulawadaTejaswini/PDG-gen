import java.util.*;

public class Main {
    long MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += c[i];
        }
        if (sum < 0) {
            System.out.println("-1");
            return;
        }
        Arrays.sort(c);
        int r = n - 1;
        boolean ru = false;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] >= 0)
                break;
            ans++;
            while (r >= 0) {
                if (!ru) {
                    ru = true;
                    ans++;
                }
                if (c[i] + c[r] >= 0) {
                    long tmp = c[i] + c[r];
                    c[i] = 0;
                    c[r] = tmp;
                    break;
                } else {
                    c[i] = c[i] + c[r];
                    ru = false;
                    r--;
                }
            }
        }
        System.out.println(ans);

    }
}
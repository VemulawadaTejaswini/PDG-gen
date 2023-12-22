import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += b[i] - a[i];
        }

        long cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                cnt += a[i] - b[i];
            } else if (a[i] < b[i]) {
                if (Math.abs(a[i] - b[i]) % 2 == 1) {
                    cnt++;
                }
                cnt += Math.abs(a[i] - b[i]) / 2;
            }
        }
        if (cnt <= sum) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}

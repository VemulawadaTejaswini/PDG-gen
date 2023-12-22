import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long[] sum = new long[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sum[0] = a[0];
            } else {
                sum[i] = sum[i - 1] + a[i];
            }
            if (sum[i] == 0) {
                cnt++;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (sum[j] - sum[i - 1] == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}

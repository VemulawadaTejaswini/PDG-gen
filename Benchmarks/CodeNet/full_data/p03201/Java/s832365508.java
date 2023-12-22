import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] masu = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    masu[i][j] = 0;
                } else {
                    masu[i][j] = a[i] + a[j];
                    // System.out.println(masu[i][j]);
                }
            }
        }
        long ans = 0;
        long count = 0;
        long max = a[n - 1] + a[n - 2];
        long nokori = 0;
        boolean flag = true;
        long kazu = n * (n - 1) / 2;
        long cnt = 0;
        while (flag) {
            count = 0;
            cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (masu[i][j] == 2) {
                        count++;
                    }
                    if (masu[i][j] % 2 == 1) {
                        masu[i][j] = 0;
                    }
                    masu[i][j] = masu[i][j] / 2;
                    // System.out.println(masu[i][j]);
                    if (masu[i][j] == 0) {
                        cnt++;
                    }
                }
            }
            if (ans < count) {
                ans = count;
            }
            if (kazu == cnt) {
                flag = false;
            }
        }
        System.out.println(ans);
    }
}
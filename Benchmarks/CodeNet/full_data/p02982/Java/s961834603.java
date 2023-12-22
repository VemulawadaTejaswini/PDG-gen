import java.util.Scanner;

public class Main {
    static final long MOD = 1000000007;
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] a = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (isAns(a[i], a[j])) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    static boolean isAns(int[] a, int[] b) {
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (a[i]-b[i])*(a[i]-b[i]);
        }
        for (int i = 0; i < 1000; i++) {
            if (i*i==sum) {
                return true;
            }
        }
        return false;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    void solve() {
        int n = in.nextInt();
        int[] a = new int[n],b = new int[n],c = new int[n],d = new int[n];
        for(int i = 0 ; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        for(int i = 0 ; i < n; i++) {
            c[i] = in.nextInt();
            d[i] = in.nextInt();
        }
        boolean[][] f = new boolean[n][n];
        for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < n; j++) {
                f[i][j] = a[i] < c[j] && b[i] < d[j];
            }
        }
        int ans1 = 0, ans2 = 0;
        for(int i = 0 ; i < n; i++) {
            int tmp = 0;
            for(int j = 0 ; j < n; j++) {
                tmp += f[i][j] ? 1 : 0;
            }
            ans1 = Math.max(ans1, tmp);
        }
        for(int i = 0 ; i < n; i++) {
            int tmp = 0;
            for(int j = 0 ; j < n; j++) {
                tmp += f[j][i] ? 1 : 0;
            }
            ans2 = Math.max(ans2, tmp);
        }
        System.out.println(Math.min(ans1, ans2));
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}

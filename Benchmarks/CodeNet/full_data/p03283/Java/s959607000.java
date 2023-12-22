
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        int q = Integer.parseInt(scan.next());
        int[][] train = new int[n][n];
        for (int i = 0; i < m; i++) {
            int l = Integer.parseInt(scan.next());
            int r = Integer.parseInt(scan.next());
            l--;
            r--;
            train[l][r]++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                train[i][j + 1] += train[i][j];
            }
        }

        for (int i = 0; i < q; i++) {
            int l = Integer.parseInt(scan.next());
            int r = Integer.parseInt(scan.next());
            l--;
            r--;

            int ans = 0;
            for (int j = l; j <= r; j++) {
                ans += train[j][r];
            }
            System.out.println(ans);
        }
        scan.close();

    }
}

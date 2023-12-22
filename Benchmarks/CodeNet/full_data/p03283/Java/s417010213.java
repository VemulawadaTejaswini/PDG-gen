import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();

        int[][] a = new int[n][n];
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            for (int j = 0; j <= l; j++) {
                for (int k = r; k < n; k++) {
                    a[j][k]++;
                }
            }
        }
        for (int i = 0; i < q; i++) {
            System.out.println(a[scanner.nextInt() - 1][scanner.nextInt() - 1]);
        }
    }
}
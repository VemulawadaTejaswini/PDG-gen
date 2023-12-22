import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int c = s.nextInt();
        int a[][] = new int[n + 1][m];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = s.nextInt();
            }
        }
        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < (n+1); i++) {
            if (i == 0)
                continue;
            for (int j = 0; j < m; j++) {
                cnt += (a[0][j] * a[i][j]);
            }
            cnt += c;
            if (cnt > 0)
                ans++;
            cnt = 0;
        }
        System.out.print(ans);
    }
}
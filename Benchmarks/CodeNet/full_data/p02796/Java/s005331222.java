import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n, x, l;
        n = sc.nextInt();
        int lx, ll;
        lx = 0;
        ll = 0;
        boolean isGone = false;
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            l = sc.nextInt();
            pair[i][0] = x;
            pair[i][1] = l;
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < n; i++) {
            x = pair[i][0];
            l = pair[i][1];
            if (i != 0) {
                if (lx + ll > x - l && !isGone) {
                    ans++;
                    isGone = true;
                } else {
                    isGone = false;
                }
            }
            lx = x;
            ll = l;
        }
        System.out.println(n - ans);
    }
}

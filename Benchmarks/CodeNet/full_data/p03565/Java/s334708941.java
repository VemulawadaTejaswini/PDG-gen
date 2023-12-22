import java.util.*;

/**
 * Created by Surya on 9/24/2017.
 */
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] r = sc.next().toCharArray(), s = sc.next().toCharArray();
        int m = r.length, n = s.length;
        boolean[][] dp = new boolean[m][n];

//        for (int i = 0; i < n; i++) {
            if (r[0] == '?' || r[0] == s[0]) {
                dp[0][0] = true;
            }
//        }

        for (int i = 1; i < m; i++) {
            if (r[i] == '?' || r[i] == s[0]) {
                dp[i][0] = true;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (r[i] == '?' || r[i] == s[j]){
                    if (dp[i-1][j-1]) {
                        dp[i][j] = true;
                    }
                }
            }
        }
        int i = 0, j=n-1;
        while(i < m) {
            if (dp[i][j]) {
                break;
            }
            i++;
        }
        if (i == m) {
            System.out.println("UNRESTORABLE");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int p = 0; p < m; p++) {
            if (p == i+1-n) {
                sb.append(s);
                p = i+1;
                continue;
            }
            if (r[p] == '?') {
                sb.append("a");
            } else {
                sb.append(r[p]);
            }
        }
        System.out.println(sb.toString());
    }
}
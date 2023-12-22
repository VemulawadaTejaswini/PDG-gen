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
                if (dp[i-1][j-1]) {
                    if (r[i] == '?' || r[i] == s[j]){
                        dp[i][j] = true;
                    }
                }
            }
        }
        List<Integer> l = new ArrayList<>();
        int i = 0, j=n-1;
        while(i < m) {
            if (dp[i][j]) {
                l.add(i);
            }
            i++;
        }
        if (l.size() == 0) {
            System.out.println("UNRESTORABLE");
            return;
        }

        StringBuilder sb = new StringBuilder();
        String min = "";
        for (int i1 : l) {
            for (int p = 0; p < m; p++) {
                if (p == i1 + 1 - n) {
                    sb.append(s);
                    p = i1 + 1;
                    continue;
                }
                if (r[p] == '?') {
                    sb.append("a");
                } else {
                    sb.append(r[p]);
                }
            }
            if (min.length() == 0) {
                min = sb.toString();
            } else if (sb.toString().compareTo(min) < 0) {
                min = sb.toString();
            }
            sb = new StringBuilder();
        }
        System.out.println(min);
    }
}
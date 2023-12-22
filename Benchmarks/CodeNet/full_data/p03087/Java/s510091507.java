import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();

        int[] l = new int[Q];
        int[] r = new int[Q];
        for (int i = 0; i < Q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        // 累積和
        int[] cum = new int[N + 1];
        for (int i = 1; i < N; i++) {
            if (isAC(S, i - 1)) {
                cum[i] = 1;
            }
        }

        for (int i = 1; i <= N; i++) {
            cum[i] += cum[i - 1];
        }

        for (int i = 0; i < Q; i++) {
            int ans = cum[r[i]] - cum[l[i] - 1];
            if(r[i] != N && isAC(S, r[i] - 1)){
                ans--;
            }
            out.println(ans);
        }
    }

    public static boolean isAC(String s, int index) {
        if(s.charAt(index) == 'A' && s.charAt(index + 1) == 'C'){
            return true;
        }
        return false;
    }
}
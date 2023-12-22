
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        String S = sc.next();
        char[] ch = S.toCharArray();
        boolean[] b = new boolean[N];
        int lc = 0;
        int rc = 0;
        ArrayList<Integer> LRp = new ArrayList<>();
        ArrayList<Integer> RLp = new ArrayList<>();
        ArrayList<Integer> P = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            b[i] = ch[i] == 'L' ? true : false;
        }
        int ans = 0;
        for (int i = 0; i < N - 2; i++) {
            if (b[i] && !b[i + 1]) {
                LRp.add(i);
                P.add(i);
            } else if (!b[i] && b[i + 1]) {
                RLp.add(i);
                P.add(i);
            }
        }
        P.add(N - 1);
        for (int i = Math.max(0,Math.min(1,P.size()-2)); i < P.size() - 1 && cnt < K; i+=2) {
            for (int k = P.get(i)+1; k <= P.get(i + 1); k++) {
                b[k] = b[k - 1];
            }
            cnt++;
        }
        for (int i = 1; i < N; i++) {
            if (b[i] && b[i - 1])
                ans++;
        }
        for (int i = N - 2; i >= 0; --i) {
            if (!b[i] && !b[i + 1])
                ans++;
        }
        // ans += Math.min(LRp.size(), K) * 2;
        // if (b[0] != b[N - 1] && LRp.size() > RLp.size()) {
        //     ans--;
        // }
        // System.out.println(LRp.size() + " " + RLp.size());
        // System.out.println(cnt + Arrays.toString(b));
        System.out.println(ans);
    }
}
import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        char s, e;
        e = 'a';
        boolean ans = true;
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
            if (i > 0) {
                s = S[i].charAt(0);
                if (s != e) {
                    ans = false;
                }
            }
            e = S[i].charAt(S[i].length() - 1);
        }
        if (ans) {
            lavel:
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (S[i].equals(S[j])) {
                        ans = false;
                        break lavel;
                    }
                }
            }
        }
        System.out.println(ans ? "Yes" : "No");
    }
}
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        String S;
        S = sc.next();
        solve(N, S);
    }

    static void solve(int N, String S) {
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int[] z = z_algorithm(S.substring(i));
            for (int j = i; j < N; j++) {
                ans = Math.max(ans, Math.min(j - i, z[j - i]));
            }
        }
        System.out.println(ans);

    }

    static int[] search(String pattern, String text) {
        return z_algorithm(pattern + "$" + text);
    }

    static int[] z_algorithm(String S) {
        int l = 0;
        int r = 0;
        int[] Z = new int[S.length()];

        for (int i = 1; i < S.length(); i++) {
            if (r < i) {
                l = r = i;
                while (r < S.length() && S.charAt(r) == S.charAt(r - l)) {
                    r++;
                }
                Z[i] = r - i;
                r--;
            } else {
                int k = i - l;
                if (i + Z[k] - 1 < r) {
                    Z[i] = Z[k];
                } else {
                    l = i;
                    while (r < S.length() && S.charAt(r) == S.charAt(r - l)) {
                        r++;
                    }
                    Z[i] = r - i;
                    r--;
                }
            }
        }
        Z[0] = S.length();
        return Z;
    }
}

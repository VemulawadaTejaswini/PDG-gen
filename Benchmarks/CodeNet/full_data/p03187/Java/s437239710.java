
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int N = sc.nextInt();
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }
        int s = 0, e = 1;
        int ans = 0;
        int pos = 0;
        for (int i = 0; i < N; i++) {
            if ((L + X[s] - pos) % L > (L - X[N - e] + pos) % L) {//+のがでかい
                ans += (L + X[s] - pos) % L;
                pos = X[s];
                s++;
            } else if ((L + X[s] - pos) % L <= (L - X[N - e] + pos) % L) {//-のがでかい
                ans += (L - X[N - e] + pos) % L;
                pos = X[N - e];
                e++;
            } else {
                if (judge(L, N, X, s, e, pos)) {
                    ans += (L + X[s] - pos) % L;
                    pos = X[s];
                    s++;
                } else {
                    ans += (L - X[N - e] + pos) % L;
                    pos = X[N - e];
                    e++;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }

    static boolean judge(int L, int N, int[] X, int s, int e, int pos) {
        boolean ans = false;
        boolean deta = false;
        int loop = 0;
        while (deta || loop>N) {
            loop++;
            if ((L + X[s + loop] - pos) % L > (L - X[N - e - loop] + pos) % L) {
                deta = true;
                ans = true;
            } else if ((L + X[s] - pos) % L <= (L - X[N - e] + pos) % L) {
                deta = true;
                ans = false;
            }
        }
        return ans;

    }
}
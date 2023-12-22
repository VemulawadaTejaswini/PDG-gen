import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int N = scan.nextInt();
        int init_r = scan.nextInt();
        int init_c = scan.nextInt();
        String S = scan.next();
        String T = scan.next();
        char[] data_S = S.toCharArray();
        char[] data_T = T.toCharArray();
        boolean answer = false;
        int[] dp_D = new int[N+1];
        int[] dp_U = new int[N+1];
        int[] dp_L = new int[N+1];
        int[] dp_R = new int[N+1];
        Arrays.fill(dp_D, Integer.MAX_VALUE);
        Arrays.fill(dp_U, Integer.MAX_VALUE);
        Arrays.fill(dp_L, Integer.MAX_VALUE);
        Arrays.fill(dp_R, Integer.MAX_VALUE);
        dp_D[0] = init_r;
        dp_U[0] = init_r;
        dp_L[0] = init_c;
        dp_R[0] = init_c;

        boolean drop = false;
        for (int i = 1; i <= N; i++) {
            if (data_S[i-1] == 'L') {
                dp_D[i] = dp_D[i-1];
                dp_U[i] = dp_U[i-1];
                dp_R[i] = dp_R[i-1];
                dp_L[i] = dp_L[i-1]-1;
            }
            if (data_S[i-1] == 'R') {
                dp_D[i] = dp_D[i-1];
                dp_U[i] = dp_U[i-1];
                dp_R[i] = dp_R[i-1]+1;
                dp_L[i] = dp_L[i-1];
            }
            if (data_S[i-1] == 'U') {
                dp_D[i] = dp_D[i-1];
                dp_U[i] = dp_U[i-1]-1;
                dp_R[i] = dp_R[i-1];
                dp_L[i] = dp_L[i-1];
            }
            if (data_S[i-1] == 'D') {
                dp_D[i] = dp_D[i-1]+1;
                dp_U[i] = dp_U[i-1];
                dp_R[i] = dp_R[i-1];
                dp_L[i] = dp_L[i-1];
            }
            if (is_drop(H, W, i, dp_D, dp_U, dp_L, dp_R)) {
                drop = true;
                break;
            }
            if (data_T[i-1] == 'L') {
                dp_D[i] = dp_D[i];
                dp_U[i] = dp_U[i];
                dp_R[i] = Math.max(dp_R[i]-1,1);
                dp_L[i] = dp_L[i];
            }
            if (data_T[i-1] == 'R') {
                dp_D[i] = dp_D[i];
                dp_U[i] = dp_U[i];
                dp_R[i] = dp_R[i];
                dp_L[i] = Math.min(dp_L[i]+1,W);
            }
            if (data_T[i-1] == 'U') {
                dp_D[i] = Math.max(dp_D[i]-1,1);
                dp_U[i] = dp_U[i];
                dp_R[i] = dp_R[i];
                dp_L[i] = dp_L[i];
            }
            if (data_T[i-1] == 'D') {
                dp_D[i] = dp_D[i];
                dp_U[i] = Math.min(dp_U[i]+1,H);
                dp_R[i] = dp_R[i];
                dp_L[i] = dp_L[i];
            }
        }
        if (drop || is_drop(H, W, N, dp_D, dp_U, dp_L, dp_R)) {
            answer = false;
        } else {
            answer = true;
        }
        System.out.println(answer ? "YES" : "NO");
    }
    private boolean is_drop(int H, int W, int n, int[] dp_D, int[] dp_U, int[] dp_L, int[] dp_R) {
        return H < dp_D[n] || dp_U[n] <= 0 || dp_L[n] <= 0 || W < dp_R[n];

    }
}

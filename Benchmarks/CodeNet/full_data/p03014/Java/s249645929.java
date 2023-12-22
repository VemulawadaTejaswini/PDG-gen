import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long H;
        H = sc.nextLong();
        long W;
        W = sc.nextLong();
        String[] S = new String[(int)(H)];
        for(int i = 0 ; i < H ; i++){
                S[i] = sc.next();
        }

        final Solver solver = new Solver();
        solver.solve(H, W, S);
    }
}

class Solver {
    final static char CLEAR = '.';

    public void solve(long H, long W, String[] S) {
        int[][] L = new int[(int) H][(int) W];
        int[][] R = new int[(int) H][(int) W];
        int[][] U = new int[(int) H][(int) W];
        int[][] D = new int[(int) H][(int) W];

        calc(L, R, U, D, S);

        int max = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                max = Math.max(
                        max,
                        L[i][j] + R[i][j] + U[i][j] + D[i][j] - 3
                );
            }
        }

        System.out.println(max);
    }

    private void calc(int[][] L, int[][] R, int[][] U, int[][] D, String[] S) {
        final int H = S.length;
        final int W = S[0].length();

        for (int i = 0; i < H; i++) {
            L[i][0] = (S[i].charAt(0) == CLEAR) ? 1 : 0;
            for (int j = 1; j < W; j++) {
                L[i][j] = (S[i].charAt(j) == CLEAR) ? L[i][j - 1] + 1 : 0;
            }

            R[i][W - 1] = (S[i].charAt(W - 1) == CLEAR) ? 1 : 0;
            for (int j = W - 2; j >= 0; j--) {
                R[i][j] = (S[i].charAt(j) == CLEAR) ? R[i][j + 1] + 1 : 0;
            }
        }

        for (int j = 0; j < W; j++) {
            U[0][j] = S[0].charAt(j) == CLEAR ? 1 : 0;
            for (int i = 1; i < H; i++) {
                U[i][j] = (S[i].charAt(j) == CLEAR) ? U[i - 1][j] + 1 : 0;
            }

            D[H - 1][j] = S[H - 1].charAt(j) == CLEAR ? 1 : 0;
            for (int i = H - 2; i >= 0; i--) {
                D[i][j] = (S[i].charAt(j) == CLEAR) ? D[i + 1][j] + 1 : 0;
            }
        }

    }
}


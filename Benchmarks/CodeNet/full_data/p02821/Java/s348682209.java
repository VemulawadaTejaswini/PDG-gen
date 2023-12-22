import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int X = 1000;
        int N = nextInt(r);
        long M = nextInt(r);
        int[] A = new int[N];
        int[][] B = new int[N*N/X+1][X];
        int c = 0;
        int d = 0;
        for (int i = 0; i < N; i++) {
            A[i] = nextInt(r);
            for (int j = i; j >= 0; j--) {
                B[d][c] = A[i]+A[j];
                sortB(X, B, c, d);
                c++;
                if (c == X) {
                    d++;
                    c = 0;
                }
                if (i != j) {
                    B[d][c] = A[i]+A[j];
                    sortB(X, B, c, d);
                    c++;
                    if (c == X) {
                        d++;
                        c = 0;
                    }
                }
            }
        }

        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < N*N/X+1; i++) {
            if (cnt >= M) break;
            for (int j = 0; j < X; j++) {
                if (cnt >= M) break;
                ans += B[i][j];
                cnt++;
            }
        }
        System.out.println(ans);
    }

    public static int nextInt(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            str += (char)c;
        }
        return Integer.parseInt(str);
    }

    public static void sortB(int X, int[][] B, int c, int d) {
        for (int k = c; k >= 0; k--) {
            if (d >= 1 && k == 0 && B[d][k] > B[d-1][X-1]) {
                int tmp = B[d-1][X-1];
                B[d-1][X-1] = B[d][k];
                B[d][k] = tmp;
                sortB(X, B, X-1, d-1);
            } else if (k >= 1 && B[d][k] > B[d][k-1]) {
                int tmp = B[d][k-1];
                B[d][k-1] = B[d][k];
                B[d][k] = tmp;
            } else {
                break;
            }
        }
    }
}

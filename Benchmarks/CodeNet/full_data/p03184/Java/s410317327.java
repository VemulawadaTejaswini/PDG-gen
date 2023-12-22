import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {

        FastReader scanner = new FastReader();
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        char[][] M = new char[H][W];

        for (int i = 0; i < N; i++) {
            M[scanner.nextInt() - 1][scanner.nextInt() - 1] = '#';
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if( M[i][j] != '#' ){
                    M[i][j] = '.';
                }
            }
        }

        int[][] DP = new int[H][W];

        int i = 0;
        while (i < W) {
            if (M[0][i] == '.') {
                DP[0][i] = 1;
            } else {
                break;
            }
            i++;
        }

        i = 0;
        while (i < H) {
            if (M[i][0] == '.') {
                DP[i][0] = 1;
            } else {
                break;
            }
            i++;
        }

        int mod = 1000000007;
        for (int j = 1; j < H; j++) {
            for (int k = 1; k < W; k++) {
                if (M[j][k] == '.') {
                    if (DP[j - 1][k] == 0 && DP[j][k - 1] != 0) {
                        DP[j][k] = DP[j][k - 1] % mod;
                    } else if (DP[j - 1][k] != 0 && DP[j][k - 1] == 0) {
                        DP[j][k] = DP[j - 1][k] % mod;
                    }
                    DP[j][k] = (DP[j - 1][k] + DP[j][k - 1]) % mod;
                }
            }
        }
        System.out.println(DP[H - 1][W - 1]);
    }

}
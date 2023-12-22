import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力
        MyScanner sc = new MyScanner(System.in);
        int[] NW = sc.nextIntArray();
        int N = NW[0];
        int W = NW[1];
        int[] w = new int[N+1];
        long[] v = new long[N+1];
        w[0] = 0;
        v[0] = 0;
        for(int i=1; i<=N; i++) {
            int[] tmp = sc.nextIntArray();
            w[i] = tmp[0];
            v[i] = tmp[1];
        }
        // System.out.println("N = " + N);
        // System.out.println("W = " + W);
        // System.out.println("w = " + Arrays.toString(w));
        // System.out.println("v = " + Arrays.toString(v));

        // 初期化
        long[][] dp = new long[N+1][W+1];

        // 主処理
        for(int i = 0; i <= N; i++) {
            for(int j = 0; j <= W; j++) {
                if (i == 0) {
                    dp[i][j] = 0;
                } else {
                    if (j < w[i]) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] + v[i]);
                    }
                }
            }
        }
        // for (long[] arr : dp) {
        //     for (long var : arr) {
        //         System.out.print(var + " ");
        //     }
        //     System.out.println();
        // }

        // 出力
        System.out.println(dp[N][W]);
    }

    static class MyScanner {
        BufferedReader br;
        // 標準入力から入力値を取得
        MyScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }
        // 標準入力を文字列で取得
        public String nextString() throws IOException {
            return br.readLine();
        }
        // 標準入力を文字列の配列で取得
        public String[] nextStringArray() throws IOException {
            return nextString().split(" ");
        }
        // 標準入力を数値で取得
        public int nextInt() throws IOException {
            return Integer.parseInt(nextString());
        }
        // 標準入力を数値の配列で取得
        public int[] nextIntArray() throws IOException {
            String[] strArr = nextStringArray();
            int[] intArr = new int[strArr.length];
            for(int i = 0; i < strArr.length; i++) {
                intArr[i] = Integer.parseInt(strArr[i]);
            }
            return intArr;
        }
    }

}

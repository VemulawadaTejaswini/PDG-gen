import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力
        MyScanner sc = new MyScanner(System.in);
        int N = sc.nextInt();
        int[][] abc = new int[N][3];
        for(int i = 0; i < N; i++) {
            int[] line = sc.nextIntArray();
            abc[i][0] = line[0];
            abc[i][1] = line[1];
            abc[i][2] = line[2];
        }
        // System.out.println(N);
        // for(int[] arr:abc) System.out.println(Arrays.toString(arr));
        // System.out.println();

        // 初期化
        int[][] dp = new int[N][3];  // 幸福度の総和の最大値
        // for(int[] arr:dp) System.out.println(Arrays.toString(arr));
        // System.out.println();

        // 主処理
        for(int i = 0; i < N; i++) {
            if(i == 0) {
                dp[0][0] = abc[0][0];
                dp[0][1] = abc[0][1];
                dp[0][2] = abc[0][2];
            } else {
                dp[i][0] = Math.max(dp[i][0], abc[i][0] + dp[i-1][1]);
                dp[i][0] = Math.max(dp[i][0], abc[i][0] + dp[i-1][2]);

                dp[i][1] = Math.max(dp[i][1], abc[i][1] + dp[i-1][0]);
                dp[i][1] = Math.max(dp[i][1], abc[i][1] + dp[i-1][2]);

                dp[i][2] = Math.max(dp[i][2], abc[i][2] + dp[i-1][0]);
                dp[i][2] = Math.max(dp[i][2], abc[i][2] + dp[i-1][1]);
            }
        }

        // 出力
        // for(int[] arr:dp) System.out.println(Arrays.toString(arr));
        System.out.println(Math.max(Math.max(dp[N-1][0],dp[N-1][1]),dp[N-1][2]));
    }

    static class MyScanner {
        BufferedReader br;
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

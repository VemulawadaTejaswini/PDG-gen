import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = nextInt(br.readLine()); // 1行目取得
        int[] h = nextIntArray(br.readLine()); // ２行目取得

        int[] dp = new int[N];
        dp[0] = 0;

        for(int i = 1; i < N; i++) {
            execute(i, h, dp);
        }
        System.out.println(dp[N-1]);
    }

    public static void execute(int i, int[] h, int[] dp) {
        if(i == 1) {
            dp[i] = Math.abs(h[i] - h[i-1]);
        } else {
            // i-1 or i-2 の小さい方を dp[i] に入れる
            int a = dp[i-1] + Math.abs(h[i] - h[i-1]);
            int b = dp[i-2] + Math.abs(h[i] - h[i-2]);
            if(a < b) {
                dp[i] = a;
            } else {
                dp[i] = b;
            }
        }
    }

    // 標準入力を文字列で取得
    public static String nextString(String line) {
        return line;
    }
    // 標準入力を文字列の配列で取得
    public static String[] nextStringArray(String line) {
        return line.split(" ");
    }
    // 標準入力を数値で取得
    public static int nextInt(String line) {
        return Integer.parseInt(line);
    }
    // 標準入力を数値の配列で取得
    public static int[] nextIntArray(String line) {
        String[] strArr = line.split(" ");
        int[] intArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    // 文字列配列を数値配列に変換
    public static int[] strToInt(String[] s) {
        int[] arr = new int[s.length];
        for(int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        return arr;
    }
    // 文字列を数値に変換
    public static int strToInt(String s) {
        return Integer.parseInt(s);
    }
}

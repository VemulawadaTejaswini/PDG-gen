import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力
        MyScanner sc = new MyScanner(System.in);
        long N = Long.parseLong(sc.nextString());

        // 初期化
        int min_len = String.valueOf(N).length();

        // 主処理
        // 1からNまで繰り返す
        for (long A = 1; A*A <= N; A++) {
            // N を A で割った余りが0なら桁数を求める
            long amari = N % A;
            if (amari == 0) {
                long B = N / A;
                int len = F(A, B);
                // 桁数が最小かどうかを判定する
                min_len = Math.min(min_len, len);
                // System.out.println(String.format("A=%s, B=%s, len=%s, min_len=%s", A, B, len, min_len));
            }

        }

        // 出力
        System.out.println(min_len);
    }

    // 10進表記における、Aの桁数とBの桁数のうち大きい方を返却
    public static int F(long A, long B) {
        int A_len = Long.toString(A).length();
        int B_len = Long.toString(B).length();
        return Math.max(A_len, B_len);
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

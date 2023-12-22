import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力
        MyScanner sc = new MyScanner(System.in);
        int[] line1 = sc.nextIntArray();
        int A = line1[0];
        int B = line1[1];
        int C = line1[2];
        int X = line1[3];
        int Y = line1[4];

        // 初期化
        long minTotal = A * X + B * Y; // AをX枚とBをY枚買った場合の金額を最小としておく

        // 主処理
        // Cを1枚以上買う場合の金額を求める(上限枚数はXかYの小さい方の2倍まで)
        for (int i = 1; i <= Math.max(X, Y)*2; i++) {
            long total = A * (Math.max(0, X-i))+ B * (Math.max(0, Y-i)) + C * i * 2;
            // 最小の金額か判定する
            if (minTotal > total) {
                // 最小の金額を変更
                minTotal = total;
            }
        }

        // 出力
        System.out.println(minTotal);
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

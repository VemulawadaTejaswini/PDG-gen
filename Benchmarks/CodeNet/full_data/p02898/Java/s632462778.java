import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力
        MyScanner sc = new MyScanner(System.in);
        // N K
        int[] line1 = sc.nextIntArray();
        int N = line1[0];
        int K = line1[1];
        // h
        int[] h = sc.nextIntArray();

        // 初期化
        int ans = 0;

        // 主処理
        for (int i = 0; i < N; i++) {
            if (h[i] >= K) {
                ans++;
            }
        }

        // 出力
        System.out.println(ans);
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
        // 標準入力を数値で取得
        public long nextLong() throws IOException {
            return Long.parseLong(nextString());
        }
        // 標準入力を数値の配列で取得
        public long[] nextLongArray() throws IOException {
            String[] strArr = nextStringArray();
            long[] intArr = new long[strArr.length];
            for(int i = 0; i < strArr.length; i++) {
                intArr[i] = Long.parseLong(strArr[i]);
            }
            return intArr;
        }
    }

}

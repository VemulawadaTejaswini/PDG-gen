import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Throwable {
		MyScanner sc = new MyScanner();
		String nkq = sc.nextString();
		String[] nkqArr = nkq.split(" ");
		int n = Integer.parseInt(nkqArr[0]);
		int k = Integer.parseInt(nkqArr[1]);
		int q = Integer.parseInt(nkqArr[2]);

		// N人のスコア(0始まり注意)
		int[] scores = new int[n];
		// 最初の持ち点としてKではなく0を設定
		for (int i = 0; i < n; i++) {
			scores[i] = 0;
		}

		// Q行分ループ
		for (int i = 0; i < q; i++) {
			int winner = sc.nextInt();
			// (正解者の番号-1)に1加算
			int before = scores[winner - 1];
			scores[winner - 1] = before + 1;
		}

		// N人分ループ
		for (int i = 0; i < n; i++) {
			int result = scores[i];
			if (k > q - result) {
				// 点数 > 誤答数(=問題数 - 正解数)
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	static class MyScanner {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public String nextString() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(nextString());
		}

		public String[] nextStringArr() throws IOException {
			return nextString().split(" ");
		}

		public Integer[] nextIntArr() throws IOException {
			String[] strArr = nextStringArr();
			Integer[] intArr = new Integer[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i]);
			}
			return intArr;
		}
	}

}

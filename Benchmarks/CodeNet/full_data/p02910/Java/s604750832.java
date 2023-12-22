import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Throwable {
		MyScanner sc = new MyScanner();
		String s = sc.nextString();
		String[] strArr = s.split("");
		boolean easy = true;
		for (int i = 0; i < strArr.length; i++) {
			if (i % 2 == 0) {
				// 奇数番目
				if (strArr[i].equals("L")) {
					// 奇数番目にLがあると踏みにくい
					easy = false;
					break;
				}
			} else {
				// 偶数番目
				if (strArr[i].equals("R")) {
					// 偶数番目にRがあると踏みにくい
					easy = false;
					break;
				}
			}
		}
		if (easy) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
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

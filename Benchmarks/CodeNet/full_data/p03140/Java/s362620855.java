import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String inStr = "";
		try {
			inStr = new String(input.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] inStrArray = inStr.split(" ");

		int N = Integer.valueOf(inStrArray[0]);
		String A = inStrArray[1];
		String B = inStrArray[2];
		String C = inStrArray[3];

		exec(N, A, B, C);

	}

	private static void exec(int _N, String _A, String _B, String _C) {

		int cnt = 0;
		for (int i = 0; i < _N; i++) {
			String tmpA = _A.substring(i, i+1);
			String tmpB = _B.substring(i, i+1);
			String tmpC = _C.substring(i, i+1);
			if (tmpA.equals(tmpB)) {
				if (!tmpA.equals(tmpC)) {
					// C入れ替える
					cnt++;
				}
			} else {
				if (tmpA.equals(tmpC)) {
					// Bを入れ替える
					cnt++;
				} else {
					if (tmpB.equals(tmpC)) {
						// Aを入れ替える
						cnt++;
					} else {
						// BとCを入れ替える
						cnt++;
						cnt++;
					}
				}
			}
		}

		System.out.println(cnt);
	}
}
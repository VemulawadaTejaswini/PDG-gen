import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String inStr = "";
		int N = 0;
		String A = "";
		String B = "";
		String C = "";
		try {
			inStr = new String(input.readLine());
			N = Integer.valueOf(inStr);
			A = new String(input.readLine());
			B = new String(input.readLine());
			C = new String(input.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

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
					cnt++;
				}
			} else {
				if (tmpA.equals(tmpC)) {
					cnt++;
				} else {
					if (tmpB.equals(tmpC)) {
						cnt++;
					} else {
						cnt++;
						cnt++;
					}
				}
			}
		}

		System.out.println(cnt);
	}

}

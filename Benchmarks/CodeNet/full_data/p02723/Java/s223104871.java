import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final int LEN = 6;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("");
		String rst = null;
		if (s != null) {
			if (s.length == LEN) {
				System.out.println(s[2] == s[3] && s[4] == s[5] ? "Yes" : "No");
			}
		}
	}
}

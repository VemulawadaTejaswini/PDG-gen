import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		br.close();

		long ans = 0;
		int bc = 0;
		boolean c = false;
		for (int i = s.length - 1; i >= 0; i--) {
			if (s[i] == 'A') {
				ans += bc;
				c = false;

			} else if (s[i] == 'B') {
				if (c) {
					bc++;
				} else {
					bc = 0;
				}
				c = false;

			} else if (s[i] == 'C') {
				if (c) {
					bc = 0;
				}
				c = true;
			}
		}
		System.out.println(ans);
	}
}

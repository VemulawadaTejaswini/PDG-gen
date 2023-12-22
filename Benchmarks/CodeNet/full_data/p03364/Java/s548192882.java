import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[][] s = new char[n][n];
		for (int i = 0; i < n; i++) {
			s[i] = br.readLine().toCharArray();
		}
		br.close();

		int ans = 0;
		char[][] t = new char[n][n];
		for (int a = 0; a < n; a++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					t[i][j] = s[(i + a) % n][j];
				}
			}
			boolean flg = true;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (t[i][j] != t[j][i]) {
						flg = false;
						break;
					}
				}
			}
			if (flg) {
				ans++;
			}
		}
		System.out.println(ans * n);
	}
}

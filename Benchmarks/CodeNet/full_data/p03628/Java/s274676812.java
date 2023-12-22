import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] s1 = br.readLine().toCharArray();
		char[] s2 = br.readLine().toCharArray();
		br.close();

		int mod = 1000000007;
		long ans = 1;
		for (int i = 0; i < n; i++) {
			if (s1[i] == s2[i]) {
				if (i == 0) {
					ans = ans * 3;
				} else {
					if (s1[i - 1] == s2[i - 1]) {
						ans = ans * 2 % mod;
					}
				}
			} else {
				if (i == 0) {
					ans = ans * 6;
				} else {
					if (s1[i - 1] != s1[i]) {
						if (s1[i - 1] == s2[i - 1]) {
							ans = ans * 2 % mod;
						} else {
							ans = ans * 3 % mod;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}

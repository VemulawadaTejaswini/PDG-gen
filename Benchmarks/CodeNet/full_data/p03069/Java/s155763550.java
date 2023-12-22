import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split("");

		int bCount = 0;
		int wCount = 0;

		for (int i = 0; i < n; i++) {
			if (str[i].equals("#")) {
				bCount++;
			} else {
				wCount++;
			}
		}

		int ans = 0;

		if (wCount > bCount) {
			for (int i = 0; i < n; i++) {
				if (str[i].equals("#")) {
					if (i + 1 < n) {
						if (str[i + 1].equals(".")) {
							ans++;
						}
					}
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				if (str[i].equals("#")) {
					if (i + 1 < n) {
						if (str[i + 1].equals(".")) {
							ans++;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}

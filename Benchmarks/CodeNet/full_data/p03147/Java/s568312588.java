import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int h[] = new int[n];
		String str[] = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(str[i]);
		}

		int res = 0;
		while (true) {
			int max = 0;
			for (int i = 0; i < n; i++) {
				max = Math.max(max, h[i]);
			}
			if (max == 0)
				break;

			int i = 0;
			while (i < n) {
				if (h[i] == 0) {
					++i;
				} else {
					++res;
					while (i < n && h[i] > 0) {
						--h[i];
						++i;
					}
				}
			}
		}
		System.out.println(res);
	}
}

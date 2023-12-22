import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 2 };
		int b[] = { 1, 1, 1, 2, 2, 3, 2, 2, 3, 3 };
		int c[] = { 2, 3, 4, 3, 4, 4, 3, 4, 4, 4 };

		int value[] = new int[5];

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split("");

			if (str[0].equals("M")) {
				value[0]++;
			} else if (str[0].equals("A")) {
				value[1]++;
			} else if (str[0].equals("R")) {
				value[2]++;
			} else if (str[0].equals("C")) {
				value[3]++;
			} else if (str[0].equals("H")) {
				value[4]++;
			}
		}

		int ans = 0;
		for (int i = 0; i < 10; i++) {
			ans += value[a[i]] * value[b[i]] * value[c[i]];
		}

		System.out.println(ans);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int n = Integer.parseInt(str);

		int ans = 0;
		int id = n;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				int num = i;
				int count = 0;
				while (num % 2 == 0) {
					num /= 2;
					count++;
				}
				if (count > ans) {
					ans = count;
					id = i;
				}
			}
		}
		System.out.println(id);
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);

		int ans = 0;

		if (x == 3) {
			ans += 100000;
		} else if (x == 2) {
			ans += 200000;
		} else if (x == 1) {
			ans += 300000;
		}
		if (y == 3) {
			ans += 100000;
		} else if (y == 2) {
			ans += 200000;
		} else if (y == 1) {
			ans += 300000;
			if (x == 1) {
				ans += 400000;
			}
		}
		System.out.println(ans);
	}
}
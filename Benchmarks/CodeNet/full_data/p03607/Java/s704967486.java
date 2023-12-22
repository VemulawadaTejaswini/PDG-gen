import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		boolean list[] = new boolean[1000000000];
		int ans = 0;

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());

			if (!list[num]) {
				list[num] = true;
				ans++;
			} else {
				list[num] = false;
				ans--;
			}
		}
		System.out.println(ans);
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);
		int y = Integer.parseInt(str[2]);

		int dist[] = new int[n - 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i > j)
					continue;

				int d = Math.min(Math.abs(i - j), Math.abs(y - j) + Math.abs(i - x) + 1);
				dist[d - 1]++;
			}
		}

		for (int i = 0; i < n - 1; i++) {
			System.out.println(dist[i]);
		}
	}
}
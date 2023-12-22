import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int x = Integer.parseInt(str[3]);
		int y = Integer.parseInt(str[4]);

		int max = Math.max(x, y);

		long ans = Long.MAX_VALUE;
		for (int i = 0; i <= max * 2; i += 2) {
			int X = (x - i / 2) < 0 ? 0 : (x - i / 2);
			int Y = (y - i / 2) < 0 ? 0 : (y - i / 2);

			ans = Math.min(ans, i * c + X * a + Y * b);
		}

		System.out.println(ans);
	}
}
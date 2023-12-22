
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String[] cut = x.split(" ");

		int a = Integer.parseInt(cut[0]);
		int b = Integer.parseInt(cut[1]);
		int c = Integer.parseInt(cut[2]);

		String u = "No";

		int y = Math.max(a, Math.max(b, c));
		if (y == a && a == b + c) {
			u = "Yes";
		} else if (y == b && b == a + c) {
			u = "YES";
		} else if (y == c && c == a + b) {
			u = "Yes";
		}
		System.out.println(u);
	}
}
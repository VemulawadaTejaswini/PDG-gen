
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

		int count = 3;

		if (a == b && a == c) {
			count = 1;
		} else {

			if (a == b) {
				count--;
			}
			if (b == c) {
				count--;
			}
			if (c == a) {
				count--;
			}
		}
		System.out.println(count);
	}
}

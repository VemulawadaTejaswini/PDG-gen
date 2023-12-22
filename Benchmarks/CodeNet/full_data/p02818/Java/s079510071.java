import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		String[] str = s.split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);

		for (int i = 0; i < k; ++i) {
			if (a > 0) {
				--a;
			} else if (b > 0) {
				--b;
			}
		}

		System.out.printf("%d %d\n", a, b);

		r.close();
	}
}
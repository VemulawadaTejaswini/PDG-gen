import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		if (n > m) {
			for (int i = 0; i < n; i++)
				System.out.print(m);
		} else {
			for (int i = 0; i < m; i++)
				System.out.print(n);
		}
		System.out.println();
	}
}
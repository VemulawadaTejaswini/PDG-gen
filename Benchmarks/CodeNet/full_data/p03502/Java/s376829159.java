
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String N = br.readLine();

			if (Integer.parseInt(N) % f(N) == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			// System.out.println(f(N) + "," + Integer.parseInt(N));
		}
	}

	private static int f(String N) {
		char[] values = N.toCharArray();
		int count = 0;
		for (char value : values) {
			count += value - '0';
		}
		return count;
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int n = str.length();

		for (int i = 0; i < n; i++) {
			System.out.print("x");
		}
		System.out.println();
	}
}

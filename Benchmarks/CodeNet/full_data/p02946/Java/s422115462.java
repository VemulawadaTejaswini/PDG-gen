import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int k = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);

		System.out.print(x - k + 1);
		for (int i = x - k + 2; i < x + k; i++) {
			System.out.print(" " + i);
		}

		System.out.println();
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");
		int result = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (str[i] == str[j])
					continue;
				if (str[i].equals(str[j])) {
					result++;
				}
			}
		}
		if (result == 4) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
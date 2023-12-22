import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int count = 0;
			for (char c : br.readLine().toCharArray()) {
				if (c - '0' != 0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}

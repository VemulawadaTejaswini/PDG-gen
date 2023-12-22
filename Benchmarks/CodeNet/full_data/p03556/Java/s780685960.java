import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());

			double root = Math.sqrt(n);

			int rootInt = (int) root;

			System.out.println(rootInt * rootInt);
		}
	}
}

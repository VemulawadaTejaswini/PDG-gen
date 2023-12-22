import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		int C = Integer.parseInt(tokens[2]);

		in.close();

		if (A < C && C < B) {
			System.out.println("Yes");
		} else if (B < C && C < A) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

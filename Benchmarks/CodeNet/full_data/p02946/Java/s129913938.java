import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int K = Integer.parseInt(tokens[0]);
		int X = Integer.parseInt(tokens[1]);

		int min = Math.max(-1000000, X - K + 1);
		int max = Math.min(1000000, X + K - 1);
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(Integer.toString(min));
		for (int i = min + 1; i <= max; ++i) {
			strBuilder.append(" " + i);
		}
		System.out.println(strBuilder.toString());
	}
}

import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		System.out.println(conv(N - 1, "1"));
		for (int i = 2; i < N; ++i) {
			System.out.println(conv(N - i, Integer.toString(i)));
		}

	}

	static String conv(int n, String str) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(str);
		for (int i = 1; i < n; ++i) {
			strBuilder.append(" " + str);
		}
		return strBuilder.toString();
	}
}

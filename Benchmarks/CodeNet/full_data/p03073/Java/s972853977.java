
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String S = in.readLine();
		in.close();
		long resultA = getCount(S, true);
		long resultB = getCount(S, false);
		System.out.println(Math.min(resultA, resultB));
	}

	static long getCount(String s, boolean firstIsZero) {
		long result = 0;
		char c = firstIsZero ? '0' : '1';
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) != c) {
				++result;
			}
			c = (c == '0') ? '1' : '0';
		}
		return result;
	}

}

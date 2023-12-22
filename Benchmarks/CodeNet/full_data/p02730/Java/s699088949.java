import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
		PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		solve(reader, writer);
		reader.close();
		writer.close();
	}

	private static void solve(BufferedReader reader, PrintWriter writer) throws IOException {
		String s = reader.readLine();
		if (isPalindrome(s) && isPalindrome(s.substring(0, s.length() / 2))
				&& isPalindrome(s.substring(s.length() / 2 + 1, s.length()))) {
			writer.println("Yes");
		} else {
			writer.println("No");
		}

	}

	private static boolean isPalindrome(String s) {
		for (int i = 0; i <= s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}
}

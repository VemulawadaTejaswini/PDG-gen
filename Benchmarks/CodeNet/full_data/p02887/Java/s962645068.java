import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		String s = in.next();
		int r = solve(s);
		System.out.println(r);
		in.close();
	}

	private static int solve(String s) {
		int r = 1;
		for (int i = 1; i < s.length(); i++)
			if (s.charAt(i - 1) != s.charAt(i))
				r++;
		return r;
	}
}
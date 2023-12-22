import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		System.out.println(solve(s));
		in.close();
	}

	private static String solve(String s) {
		char a = s.charAt(0);
		char b = s.charAt(1);
		if (a == b)
			if (s.charAt(2) == s.charAt(3) && s.charAt(2) != a)
				return "Yes";
			else
				return "No";
		else if (s.charAt(2) == a && s.charAt(3) == b)
			return "Yes";
		else if (s.charAt(2) == b && s.charAt(3) == a)
			return "Yes";
		else
			return "No";
	}
}

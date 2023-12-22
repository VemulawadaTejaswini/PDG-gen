import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		String r = solve(s);
		System.out.println(r);
		in.close();
	}

	private static String solve(String s) {
		if (isRotate(s) && isRotate(s.substring(0, s.length() / 2)))
			return ("Yes");
		else
			return ("No");
	}

	private static boolean isRotate(String s) {
		for (int i = 0; i < s.length() / 2; i++)
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		return true;
	}
}
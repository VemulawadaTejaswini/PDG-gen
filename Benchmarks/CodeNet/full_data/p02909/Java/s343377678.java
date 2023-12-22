import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		do {
			String s = in.next();
			System.out.println(solve(s));
		} while (TEST);
	}

	private static String solve(String s) {
		if (s.equals("Sunny"))
			return "Cloudy";
		else if (s.equals("Cloudy"))
			return "Rainy";
		else
			return "Sunny";
	}
}
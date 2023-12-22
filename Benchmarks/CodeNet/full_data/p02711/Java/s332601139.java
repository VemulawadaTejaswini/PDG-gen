import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		boolean r = solve(n);
		if (r)
			System.out.println("Yes");
		else
			System.out.println("No");
		in.close();
	}

	private static boolean solve(int n) {
		if (n == 0)
			return false;
		if (n % 10 == 7)
			return true;
		return solve(n /= 10);
	}
}
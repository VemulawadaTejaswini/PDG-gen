import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		System.out.println(solve(n));
		in.close();
	}

	private static int solve(int n) {
		int r = 1;
		r *= n;
		r *= n;
		r *= n;
		return r;
	}
}
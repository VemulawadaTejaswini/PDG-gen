import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int l = in.nextInt();
		double r = solve((double) l);
		System.out.println(r);
	}

	private static double solve(double l) {
		l /= 3;
		return l * l * l;
	}
}
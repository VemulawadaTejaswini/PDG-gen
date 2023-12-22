import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		long r = solve(n);
		System.out.println(r);
		in.close();
	}

	private static long solve(int n) {
		long r = 0;
		for (int i = 1; i <= n; i++)
			if (i % 3 == 0 || i % 5 == 0)
				continue;
			else
				r += i;
		return r;
	}

}
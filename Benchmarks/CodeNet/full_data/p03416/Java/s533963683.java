import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(solve(a, b));
		in.close();
	}

	private static int solve(int a, int b) {
		int r = 0;
		for (int i = 1; i <= 9; i++)
			for (int j = 0; j <= 9; j++)
				for (int k = 0; k <= 9; k++) {
					int x = (i * 10001 + j * 1010 + k * 100);
					if (x >= a && x <= b)
						r++;
				}
		return r;
	}
}
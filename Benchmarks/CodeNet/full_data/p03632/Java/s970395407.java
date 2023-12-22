import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			final int A = s.nextInt();
			final int B = s.nextInt();
			final int C = s.nextInt();
			final int D = s.nextInt();
			
			final int ans = judgeTwoSwitches(A, B, C, D);
			System.out.println(ans);
		}
	}

	private static int judgeTwoSwitches(int a, int b, int c, int d) {
		if (b < c || d < a)
			return 0;
		else if (a < c && b < d)
			return b - c;
		else if (c < a && d < b)
			return d - a;
		else if (a < c && d < b)
			return d - c;
		else if (c < a && b < d)
			return b - a;
		else 
			return 0;
	}
}

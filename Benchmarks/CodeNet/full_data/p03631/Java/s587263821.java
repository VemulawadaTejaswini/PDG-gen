import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			
			if (true == timesFraction(N))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

	private static boolean timesFraction(int n) {
		// int to ArrayString
		String[] s =  String.valueOf(n).split("");
		
		int N = s.length;
		final int M = (int)(N / 2);
		
		for (int i = 0; i < M; i++) {
			if (false == s[i].equals(s[N - 1])) {
				return false;
			}
		}
		return true;
	}
}
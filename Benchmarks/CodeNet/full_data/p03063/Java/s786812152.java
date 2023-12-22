import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		String s = in.next();
		System.out.println(solve(n, s));
		in.close();
	}

	private static int solve(int n, String s) {
		int w2 = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == '.')
				w2++;

		int b1 = 0;
		int ans;
		if (w2 > s.length() - w2)
			ans = s.length() - w2;
		else
			ans = w2;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.') {
				w2--;
			} else {
				b1++;
			}
			if (b1 + w2 < ans)
				ans = b1 + w2;
		}
		return ans;
	}
}

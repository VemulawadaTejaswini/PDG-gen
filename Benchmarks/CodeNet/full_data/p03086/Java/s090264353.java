import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		System.out.println(solve(s));
		in.close();
	}

	private static int solve(String s) {
		int ans = 0;
		int t = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == 'A' || s.charAt(i) == 'T' || s.charAt(i) == 'G' || s.charAt(i) == 'C') {
				t++;
				if (t > ans)
					ans = t;
			} else
				t = 0;
		return ans;
	}
}
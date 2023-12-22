import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long k = sc.nextLong();

		int a = 0;
		while (a < s.length() && s.charAt(0) == s.charAt(a)) a++;

		int b = 0;
		while (s.length() - b - 1 >= 0 && s.charAt(s.length() - 1) == s.charAt(s.length() - b - 1))
			b++;

		long c = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) != s.charAt(i)) continue;
			long t = 1L;
			while (i < s.length() && s.charAt(i - 1) == s.charAt(i)) {
				i++;
				t++;
			}
			c += t / 2L;
		}

		long answer = k * c;
		if (s.charAt(0) != s.charAt(s.length() - 1)) {
			System.out.println(answer);
			return;
		}

		answer -= (a / 2L) * (k - 1L);
		answer -= (b / 2L) * (k - 1L);
		answer += ((a + b) / 2L) * (k - 1L);
		System.out.println(answer);
	}
}

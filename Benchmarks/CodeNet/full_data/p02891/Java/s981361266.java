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
		long t = 0;
		for (int i = 0; i < s.length(); i++) {
			t++;
			if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
				c += t / 2L;
				t = 0;
			}
		}

		long answer = k * c;
		if (s.charAt(0) != s.charAt(s.length() - 1)) {
			System.out.println(answer);
			return;
		}

		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);

		answer -= (a / 2L) * (k - 1L);
		answer -= (b / 2L) * (k - 1L);
		answer += ((a + b) / 2L) * (k - 1L);
		System.out.println(answer);
	}
}

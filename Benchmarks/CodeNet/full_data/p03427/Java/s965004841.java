import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long iti = n % 10 + 1;

		String s = String.valueOf(n - iti);
		int ans = Integer.valueOf(Character.getNumericValue(s.charAt(0)));
		for (int i = 1; i < s.length(); i++) {
			if (i == s.length() - 1 || i == s.length() - 2) {
				ans += Integer.valueOf(Character.getNumericValue(s.charAt(i)));
			} else {
				ans += 9;
			}
		}
		System.out.println(ans);

		sc.close();
	}

}

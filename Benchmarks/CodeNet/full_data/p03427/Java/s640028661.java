import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long iti = n % 10;

		String s = String.valueOf(n - iti - 1);
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			ans += Integer.valueOf(s.charAt(i));
		}
		System.out.println(ans);

		sc.close();
	}

}

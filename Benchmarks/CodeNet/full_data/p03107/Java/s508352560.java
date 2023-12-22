import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int one = 0;
		int zero = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 0) {
				one++;
			} else {
				zero++;
			}
		}

		System.out.println(Math.min(one, zero) * 2);
	}
}

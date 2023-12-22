import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			if (q == 1) {
				s = new StringBuilder(s).reverse().toString();
			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if (f == 1) {
					s = c + s;
				} else {
					s = s + c;
				}
			}
		}

		System.out.println(s);

	}
}
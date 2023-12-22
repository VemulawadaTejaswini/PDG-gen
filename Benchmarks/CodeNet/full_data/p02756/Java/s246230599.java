import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int q = scanner.nextInt();
		String c;
		for (int i = 0, t, f; i < q; i++) {
			t = scanner.nextInt();
			switch (t) {
			case 1:
				s = new StringBuilder(s).reverse().toString();
				break;
			case 2:
				f = scanner.nextInt();
				c = scanner.next();
				switch (f) {
				case 1:
					s = c + s;
					break;
				case 2:
					s += c;
				}
			}
		}
		System.out.println(s);
	}

}

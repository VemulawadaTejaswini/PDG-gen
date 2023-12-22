import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = a + b;
		int n = Integer.parseInt(c);
		boolean f = false;
		for (int i = 0; i < n; i++) {
			if (i*i == n) {
				f = true;
				break;
			}
		}
		if (f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

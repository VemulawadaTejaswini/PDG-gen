import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String s;
		a = sc.nextInt();
		b = sc.nextInt();
		s = sc.next();

		for (int i = 0; i < a + b + 1; i++) {
			if(i != a && s.charAt(i) == '-') {
				System.out.print("No");
				return;
			} else if(i == a && s.charAt(i) != '-') {
				System.out.print("No");
				return;
			}
		}

		System.out.print("Yes");
	}
}
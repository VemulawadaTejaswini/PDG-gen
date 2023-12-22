import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		sc.close();

		int a = p + q;
		int b = q + r;
		int c = r + p;

		if (a > b) {
			if (b > c) {
				System.out.println(c);
			} else {
				System.out.println(b);
			}
		} else if (a > c) {
			System.out.println(c);
		} else {
			System.out.println(a);
		}
	}
}

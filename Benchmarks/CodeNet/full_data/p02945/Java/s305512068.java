import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int c = (a + b);
		int d = (a - b);
		int e = (a * b);

		if (c < d) {
			c = d;
			if (d < e) {
				d = e;
				System.out.println(e);
			} else {
				System.out.println(d);
			}
		} else {
			System.out.println(c);
		}
	}
}

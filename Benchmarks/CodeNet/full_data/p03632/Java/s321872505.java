import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		if (a < c) {
			a = c;
		}
		if (b > d) {
			b = d;
		}
		if (b - a < 0) {
			System.out.println(0);
		} else {
			System.out.println(b - a);
		}
	}
}

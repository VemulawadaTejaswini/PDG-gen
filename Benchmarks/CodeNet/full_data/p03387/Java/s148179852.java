import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int max = Math.max(a, b);
		max = Math.max(max, c);

		int d = 0;
		d += max - a;
		d += max - b;
		d += max - c;

		if (d % 2 == 0) {
			System.out.println(d / 2);
		} else {
			System.out.println((d + 3) / 2);
		}
	}
}

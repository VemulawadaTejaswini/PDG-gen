import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = 0;

		for (int i = 0; i < 2; i++) {
			if (a >= b) {
				n += a;
				a--;
			} else {
				n += b;
				b--;
			}
		}
		System.out.print(n);
	}
}
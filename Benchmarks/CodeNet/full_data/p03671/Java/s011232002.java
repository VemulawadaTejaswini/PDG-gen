import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int an = 0;

		if (a >= b && b >= c) {
			an = c + b;
		} else if (a >= c && c >= b) {
			an = c + b;
		} else if (c >= a && a >= b) {
			an = a + b;
		} else if (b >= a && a >= c) {
			an = a + c;
		} else if (b >= c && c >= a) {
			an = a + c;
		} else if (c >= b && b >= a) {
			an = b + c;
		}
		System.out.println(an);
	}

}
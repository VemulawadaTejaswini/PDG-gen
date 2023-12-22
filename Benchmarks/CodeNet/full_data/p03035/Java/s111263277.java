import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a >= 13) {

		} else if (6 <= a && a <= 12) {
			b = b / 2;
		} else {
			b = 0;
		}
		System.out.println(b);
	}
}
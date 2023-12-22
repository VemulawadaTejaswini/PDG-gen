import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();

		int a;
		a = n / 2;
		if (n % 2 == 0) {
			System.out.println(a * a);
		} else {
			System.out.println(a * (a + 1));
		}

	}

}

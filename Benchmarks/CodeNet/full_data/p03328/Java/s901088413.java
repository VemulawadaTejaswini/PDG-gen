import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int a = 0;
		int b = 0;
		for (int i = 1; i < 999; i++) {
			a = a + i;
			b = a + i + 1;

			if (a - A > 0 && b - B > 0) {
				System.out.println(a - A);
				break;
			}
		}
	}

}

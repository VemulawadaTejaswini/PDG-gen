import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			int rect1 = a * b;
			int rect2 = c * d;

			System.out.println(rect1 >= rect2 ? rect1 : rect2);

		} finally {
			sc.close();
		}
	}
}
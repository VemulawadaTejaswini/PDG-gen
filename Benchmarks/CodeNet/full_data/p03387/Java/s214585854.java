import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = Math.max(a, Math.max(b, c));

		if ((max - a + max - b + max - c) % 2 == 0) {
			System.out.println((max - a + max - b + max - c) / 2);
		} else {
			System.out.println((max - a + max - b + max - c) / 2 + (max - a + max - b + max - c) % 2 + 1);
		}

		sc.close();

	}

}
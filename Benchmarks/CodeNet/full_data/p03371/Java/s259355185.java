import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int nowX = 0;
		int nowY = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= Math.max(2 * x, 2 * y); i += 2) {
			int sum = 0;
			nowX = Math.max(0, x - i / 2);
			nowY = Math.max(0, y - i / 2);
			sum = nowX * a + nowY * b + i * c;
			min = Math.min(min, sum);
		}

		System.out.println(min);

		sc.close();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int min = 0, max = 0;

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (min > x || i == 0) {
				min = x;
			} else if (x > max) {
				max = x;
			}
		}
		
		System.out.println((max - min));

		sc.close();
	}
}
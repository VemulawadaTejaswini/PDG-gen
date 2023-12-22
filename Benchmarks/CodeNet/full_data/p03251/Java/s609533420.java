import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int x, y;
		int maxX = -100;
		int minY = 100;

		if (X >= Y) {
			System.out.println("War");
			return;
		}

		for (int i = 0; i < N; i++) {
			x = sc.nextInt();
			maxX = x > maxX ? x : maxX;
		}

		for (int i = 0; i < M; i++) {
			y = sc.nextInt();
			minY = y < minY ? y : minY;
		}

		if (maxX >= minY || maxX >= Y || X >= minY) {
			System.out.println("War");
			return;
		}

		System.out.println("No War");

		return;
	}
}

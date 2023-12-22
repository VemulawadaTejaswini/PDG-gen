import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int x, y;
		int maxX = -101;
		int minY = 101;

		for(int i = 0; i < N; i++) {
			x = sc.nextInt();
			if(x > maxX) {
				maxX = x;
			}
		}
		for(int i = 0; i < M; i++) {
			y = sc.nextInt();
			if(y < minY) {
				minY = y;
			}
		}

		if(X + 1 <= Y && maxX + 1 <= minY && X < maxX && minY <= Y) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
	}

}
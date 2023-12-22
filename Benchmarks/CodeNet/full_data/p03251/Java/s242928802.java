import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int maxX = x;
		int minY = y;
		for(int i = 0 ; i < n ; i++) {
			int x2 = sc.nextInt();
			maxX = Math.max(maxX, x2);
		}
		for(int i = 0 ; i < m ; i++) {
			int y2 = sc.nextInt();
			minY = Math.min(minY, y2);
		}

		sc.close();
		System.out.println(maxX < minY ? "No War" : "War");

	}
}


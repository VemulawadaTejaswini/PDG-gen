import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int [] x = new int [n];
		int [] y = new int [n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		double ans = 0;
		for(int a = 0; a < n; a++) {
			for(int b = a + 1; b < n; b++) {
				long distX = x[a] - x[b];
				long distY = y[a] - y[b];
				double dist = Math.sqrt(distX * distX + distY * distY);
				ans = Math.max(ans, dist);
			}
		}

		System.out.println(ans / 2);
	}

}
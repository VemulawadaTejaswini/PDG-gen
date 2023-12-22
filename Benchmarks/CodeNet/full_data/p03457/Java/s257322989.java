import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int t[] = new int[N+1];
		int x[] = new int[N+1];
		int y[] = new int[N+1];
		for (int i = 1; i <= N; i++) {
			t[i] = scanner.nextInt();
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}
		scanner.close();
		
		for (int i = 1; i <= N; i++) {
			if (Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]) > t[i]) {
				System.out.println("No");
				return;
			} else if ((Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]) - t[i]) % 2 != 0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
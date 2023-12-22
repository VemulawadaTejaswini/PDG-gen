import java.util.Scanner;

public class Main {
	int f(int x, int y) {
		if (x > y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		if (x == 0) {
			return -y;
		}
		return 2 * x * (y / x) + f(y % x, x);
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		System.out.println((n + f(n - x, x)));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}

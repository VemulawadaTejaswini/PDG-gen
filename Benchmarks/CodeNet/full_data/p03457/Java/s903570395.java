import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]t = new int[N + 1];
		int[]x = new int[N + 1];
		int[]y = new int[N + 1];
		for(int i = 0; i < N; i++) {
			t[i + 1] = sc.nextInt();
			x[i + 1] = sc.nextInt();
			y[i + 1] = sc.nextInt();
		}
		sc.close();
		for(int i = 1; i <= N; i++) {
			int dt = t[i] - t[i - 1];
			int dl = Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
			if(dt >= dl) {
				if((dt - dl) % 2 != 0) {
					System.out.println("No");
					System.exit(0);
				}
			}else {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}
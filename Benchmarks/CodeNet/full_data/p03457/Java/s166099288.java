import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int t[] = new int[110000];
		int x[] = new int[110000];
		int y[] = new int[110000];

		boolean can = true;

		//初期状態
		t[0] = 0;
		x[0] = 0;
		y[0] = 0;

		for (int i = 0; i < N; i++) {
			t[i+1] = sc.nextInt();
			x[i+1] = sc.nextInt();
			y[i+1] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {

			int dt = t[i+1] - t[i];
			int dist = Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]);

			if(dt < dist) {
				can = false;
			}
			if ((dist - dt)%2 != 0) {
				can = false;
			}
		}

		if(can) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}

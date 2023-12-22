import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int Y = sc.nextInt();
		int x, y, z;
		x = y = z = -1;

		outside:
		for (int i = 0; i <= N; i++) {
			for (int j = 0; i + j <= N; j++) {
				int k = N - (i + j);
				int amt = 10000 * i + 5000 * j + 1000 * k;
				if (Y == amt) {
					x = i;
					y = j;
					z = k;
					break outside;
				}
			}
		}
		System.out.printf("%d %d %d\n",x ,y ,z);
		sc.close();		
	}

}
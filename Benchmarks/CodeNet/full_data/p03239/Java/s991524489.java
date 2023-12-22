import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();

		int c[] = new int[N];
		int t[] = new int[N];
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			c[cnt] = sc.nextInt();
			t[cnt] = sc.nextInt();
			if (t[cnt] <= T) {
				cnt++;
			}
		}
		int minC = 1001;
		// 指定時間内無
		if (cnt == 0) {
			System.out.println("TLE");
		} else {
			
			for (int i = 0; i < cnt; i++) {
				if (minC > c[i]) {
					minC = c[i];
				}
			}
			if (minC == 1001) {
				System.out.println("TLE");
			}else {
				System.out.println(minC);
			}

		}

	}

}
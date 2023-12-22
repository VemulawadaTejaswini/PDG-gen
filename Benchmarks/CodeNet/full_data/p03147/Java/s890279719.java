import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();

		int cnt = 0;
		// hを初めから見ていって、0になるまでループ
		for (int i = 0; i < N; i++) {
			while (h[i] > 0) {
				// 先の花を見ていって、0でなければ一緒に水をやる
				for (int j = i; j < N; j++) {
					if (h[j] == 0) {
						break;
					}
					h[j]--;
				}
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}

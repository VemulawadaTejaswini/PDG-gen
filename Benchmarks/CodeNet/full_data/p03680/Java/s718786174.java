import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		boolean[] dist = new boolean[N];

		int btn = 0;
		int ans = -1;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (dist[btn]) break;
			dist[btn] = true;
			
			if (a[btn] == 2) {
				ans = cnt + 1;
				break;
			}
			btn = a[btn] - 1;
			cnt++;
		}
		
		System.out.println(ans);
	}
}

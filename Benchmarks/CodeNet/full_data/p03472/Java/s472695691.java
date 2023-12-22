import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int h = sc.nextInt();
		int slash[] = new int[n];
		int thr[] = new int[n];
		int slashmax = Integer.MIN_VALUE;
		int throwmin = Integer.MAX_VALUE;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			slash[i] = sc.nextInt();
			thr[i] = sc.nextInt();
			slashmax = Math.max(slashmax, slash[i]);
			throwmin = Math.min(throwmin, thr[i]);
		}
		Arrays.sort(slash);
		Arrays.sort(thr);
		for (int i = n - 1; i >= 0; i--) {
			if (h <= 0) {
				break;
			}
			if (thr[i] > slashmax) {
				h = h - thr[i];
				cnt++;
			}
		}
		if (h > 0) {
			cnt += h / slashmax;
			if (h % slashmax != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

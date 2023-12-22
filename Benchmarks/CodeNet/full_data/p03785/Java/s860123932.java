import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		Arrays.sort(t);
		int cnt = 1;
		int bus = 1;
		int tmp = t[0];
		for (int i = 1; i < n; i++) {
			if (cnt < c && (tmp <= t[i] && tmp + k >= t[i])) {
				cnt++;
			} else {
				tmp = t[i];
				cnt = 1;
				bus++;
			}
		}
		System.out.println(bus);
	}
}

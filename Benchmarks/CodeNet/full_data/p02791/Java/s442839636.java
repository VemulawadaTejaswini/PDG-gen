import java.util.Scanner;

public class Main {
	static int ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		for (int i = 0; i < n; i++) {
			check(n, a, i);
		}

		System.out.println(ans);
	}

	public static void check(int n, int[] a, int i) {
		for (int j = 0; j < i; j++) {
			if (a[i] > a[j])
				return;
		}
		ans++;
	}

}

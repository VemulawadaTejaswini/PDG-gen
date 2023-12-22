import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			al.add(sc.nextInt());
		}
		int t, b, c;
		for (int i = 0; i < m; i++) {
			b = sc.nextInt();
			c = sc.nextInt();
			for (int j = 0; j < b; j++) {
				al.add(c);
			}
		}
		al.sort(Comparator.reverseOrder());
		long ans = 0;
		int idx = 0;
		for (int i : al) {
			ans += i;
			idx++;
			if (idx >= n) {
				break;
			}
		}
		System.out.println(ans);
	}
}
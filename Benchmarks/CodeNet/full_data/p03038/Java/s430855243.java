import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		Change[] base = new Change[m];
		for (int i = 0; i < m; i++) {
			base[i] = new Change(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(base, new Comparator<Change>() {
		public int compare(Change c1, Change c2) {
			return c2.c - c1.c;
		}
		});
		int[] rel = new int[n];
		int idx = 0;
		for (int i = 0; idx < n && i < m; i++) {
			for (int j = 0; idx < n && j < base[i].b; j++) {
				rel[idx] = base[i].c;
				idx++;
			}
		}
		long total = 0;
		for (int i = 0; i < n; i++) {
			total += Math.max(arr[i], rel[i]);
		}
		System.out.print(total);
	}
	
	static class Change {
		int b;
		int c;
		public Change(int b, int c) {
			this.b = b;
			this.c = c;
		}
	}
}

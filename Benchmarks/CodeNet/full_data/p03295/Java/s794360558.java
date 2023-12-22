import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		int[] arr = new int[n];
		Pair[] pairs = new Pair[m];
		for (int i = 0; i < m; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			pairs[i] = new Pair(Math.min(a, b), Math.max(a, b));
		}
		Stream.of(pairs)
			.sorted(Comparator.comparing(Pair::getA).thenComparing(Pair::getB))
			.forEach(p -> {
				if(arr[p.a] == arr[p.b]) {
					arr[p.b] = arr[p.a] + 1;
				}
			});
		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			if(arr[i] != arr[i + 1]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}

class Pair {
	int a, b;
	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() { return this.a; }
	public int getB() { return this.b; }
}
import java.util.Scanner;

public class Main {
	int n;
	Integer w[];

	public Main(int n, Integer w[]) {
		this.n = n;
		this.w = w;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Integer w[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			w[i] = s.nextInt();
		}
		System.out.println(new Main(n, w).calc());
	}

	public int calc() {
		int res = Integer.MAX_VALUE;
		for (int ti = 0; ti < w.length; ti++) {
			int s1 = 0;
			int s2 = 0;
			for (int i = 0; i <= ti; i++) {
				s1 += w[i];
			}
			for (int i = w.length - 1; ti < i; i--) {
				s2 += w[i];
			}
			res = Math.min(Math.abs(s1 - s2), res);
		}
		return res;
	}
}
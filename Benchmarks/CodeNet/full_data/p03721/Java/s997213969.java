import java.util.Arrays;
import java.util.Scanner;

public class Main {
	class D implements Comparable<D>{
		int a, b;

		D(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(D o) {
			if (this.a != o.a) {
				return this.a - o.a;
			}
			return this.b - o.b;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		D[] d = new D[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			d[i] = new D(a, b);
		}
		Arrays.sort(d);
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (sum + (long)d[i].b < k) {
				sum += (long)d[i].b;
			} else {
				System.out.println(d[i].a);
				return;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

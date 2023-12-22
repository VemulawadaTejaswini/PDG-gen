import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		Dish[] ds = new Dish[N];
		for (int i = 0; i < N; i++) {
			long A = sc.nextInt();
			long B = sc.nextInt();
			ds[i] = new Dish(A, B);
		}
		Arrays.sort(ds);
		long ans = 0;
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				ans += ds[i].a;
			} else {
				ans -= ds[i].b;
			}
		}
		System.out.println(ans);
	}

	static class Dish implements Comparable<Dish> {
		long a, b;

		public Dish(long a, long b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Dish o) {
			return -Long.compare(this.a + this.b, o.a + o.b);
		}
	}
}
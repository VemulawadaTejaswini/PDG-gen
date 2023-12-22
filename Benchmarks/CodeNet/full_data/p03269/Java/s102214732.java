import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		sc.close();

		int c = 1;
		int w = 1;
		List<Hen> list = new ArrayList<>();
		while (w * 2 <= l && c < 19) {
			c++;
			list.add(new Hen(c - 1, c, 0));
			list.add(new Hen(c - 1, c, w));
			w *= 2;
		}

		int n = c + 1;
		int rem = l;
		while (w > 0) {
			while (w <= rem) {
				rem -= w;
				list.add(new Hen(c, n, rem));
			}
			w /= 2;
			c--;
		}

		int m = list.size();
		System.out.println(n + " " + m);
		for (Hen h : list) {
			System.out.println(h.a + " " + h.b + " " + h.w);
		}
	}

	static class Hen {
		int a, b, w;

		public Hen(int a, int b, int w) {
			this.a = a;
			this.b = b;
			this.w = w;
		}
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		sc.close();

		int a = 18;
		for (int i = 1; i <= 18; i++) {
			if (1 << i > l) {
				a = i - 1;
				break;
			}
		}

		int n = a + 2;
		List<Obj> list = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			list.add(new Obj(n - i - 1, n - i, 0));
			list.add(new Obj(n - i - 1, n - i, 1 << i));
		}
		int a2 = 1 << a;
		int rem = l;
		int now = 0;
		int to = 2;
		while (rem > 0) {
			if (rem >= a2) {
				list.add(new Obj(1, to, now));
				now += a2;
				rem -= a2;
			} else {
				to++;
				a2 /= 2;
			}
		}

		System.out.println(n + " " + list.size());
		for (Obj o : list) {
			System.out.println(o.u + " " + o.v + " " + o.w);
		}
	}

	static class Obj {
		int u, v, w;

		public Obj(int u, int v, int w) {
			this.u = u;
			this.v = v;
			this.w = w;
		}
	}
}

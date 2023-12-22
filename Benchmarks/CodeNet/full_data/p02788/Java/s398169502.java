import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			long d = sc.nextLong();
			long a = sc.nextLong();
			long dd = d * 2;
			List<Enemy> list = new ArrayList<Enemy>();
			for (long i = 0; i < n; i++) {
				list.add(new Enemy(sc.nextInt(), sc.nextInt(), dd, a));
			}
			Collections.sort(list, (Enemy e1, Enemy e2) -> {
				return e1.x - e2.x >= 0L ? 1 : -1;
			});

			long cnt = 0;

			int lsize = list.size();
			for (int i = 0; i < lsize; i++) {
				Enemy e = list.get(i);
				if (e.h > 0) {
					for (int j = i; j < lsize; j++) {
						Enemy ed = list.get(j);
						if (e.dd < ed.x) break;
						if (e.x <= ed.x && 0 < ed.h) {
							ed.h -= e.h;
						}
					}
					cnt += e.h;
				}
			}

			System.out.println(cnt);

		}
	}

}

class Enemy {
	long x;
	long h;
	long dd;
	Enemy(long x, long h, long dd, long a) {
		this.x = x;
		this.h = h / a + (h % a > 0L ? 1L : 0L);
		this.dd = x + dd;
	}
}

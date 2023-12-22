import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int a = sc.nextInt();
			List<Enemy> list = new ArrayList<Enemy>();
			for (int i = 0; i < n; i++) {
				list.add(new Enemy(sc.nextInt(), sc.nextInt()));
			}
			Collections.sort(list, (Enemy e1, Enemy e2) -> {
				return e1.x - e2.x;
			});

			long cnt = 0;

			int lsize = list.size();
			for (int i = 0; i < lsize; i++) {
				Enemy e = list.get(i);
				if (e.h > 0) {
					long r = e.x + d * 2;
					int c = (int) Math.ceil((double) e.h / a);
					long damage = c * a;
					for (int j = i; j < lsize; j++) {
						Enemy ed = list.get(j);
						if (r < ed.x) break;
						if (e.x <= ed.x) {
							ed.h -= damage;
						}
					}
					cnt += c;
				}
			}

			System.out.println(cnt);

		}
	}

}

class Enemy {
	int x;
	int h;
	Enemy(int x, int h) {
		this.x = x;
		this.h = h;
	}
}

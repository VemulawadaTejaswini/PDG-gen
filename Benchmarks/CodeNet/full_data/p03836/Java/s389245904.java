import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	boolean[][] wall = new boolean[3000][3000];
	int OFFSET = +1000;

	String bfs(int sx, int sy, int tx, int ty) {
		// cost, x, y, route
		PriorityQueue<Tuple4<Integer, Integer, Integer, String>> que = new PriorityQueue<>(
				(a, b) -> Integer.compare(a.car, b.car));

		que.add(new Tuple4<>(0, sx, sy, ""));

		boolean[][] visited = new boolean[3000][3000];
		for(int i=0;i<visited.length;i++) {
			Arrays.fill(visited[i], false);
		}
		
		while (!que.isEmpty()) {
			Tuple4<Integer, Integer, Integer, String> t = que.poll();
			int cost = t.car;
			int x = t.cdr.car;
			int y = t.cdr.cdr.car;
			String r = t.cdr.cdr.cdr.car;

			if (x == tx && y == ty) {
				return r;
			}
			visited[x +OFFSET][y + OFFSET] = true;


			if (wall[x + OFFSET][y + 1 + OFFSET] == false && !visited[x+OFFSET][y+1+OFFSET]) {
				que.add(new Tuple4<>(cost + 1, x, y + 1, r + "U"));
			}
			if (wall[x + OFFSET][y - 1 + OFFSET] == false && !visited[x+OFFSET][y-1+OFFSET]) {
				que.add(new Tuple4<>(cost + 1, x, y - 1, r + "D"));
			}
			if (wall[x + 1 + OFFSET][y + OFFSET] == false && !visited[x+1+OFFSET][y+OFFSET]) {
				que.add(new Tuple4<>(cost + 1, x + 1, y, r + "R"));
			}
			if (wall[x - 1 + OFFSET][y + OFFSET] == false && !visited[x-1+OFFSET][y+OFFSET]) {
				que.add(new Tuple4<>(cost + 1, x - 1, y, r + "L"));
			}
		}
		return null;
	}

	void updateWall(String r, int sx, int sy, int tx, int ty) {
		int x = sx;
		int y = sy;

		for (int i = 0; i < r.length(); i++) {
			switch (r.charAt(i)) {
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			case 'R':
				x++;
				break;
			case 'L':
				x--;
				break;
			}

			if (!((sx == x && sy == y) || (tx == x && ty == y))) {
				wall[x + OFFSET][y + OFFSET] = true;

			}
		}
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		int OFFSET = +1000;

		for (int i = 0; i < wall.length; i++) {
			Arrays.fill(wall[i], false);

		}

		for (int x = 0; x < wall.length; x++) {
			wall[x][-1000 + OFFSET] = true;
			wall[x][1000 + OFFSET] = true;
		}
		for (int y = 0; y < wall.length; y++) {
			wall[-1000 + OFFSET][y] = true;
			wall[1000 + OFFSET][y] = true;
		}

		sc.close();

		String s1 = bfs(sx, sy, tx, ty);
		updateWall(s1, sx, sy, tx, ty);

		String s2 = bfs(tx, ty, sx, sy);
		updateWall(s2, tx, ty, sx, sy);

		String s3 = bfs(sx, sy, tx, ty);
		updateWall(s3, sx, sy, tx, ty);

		String s4 = bfs(tx, ty, sx, sy);

		out.println(s1 + s2 + s3 + s4);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

class Pair<A, B> {
	A car;
	B cdr;

	public Pair(A _car, B _cdr) {
		car = _car;
		cdr = _cdr;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Pair)) {
			return false;
		}
		Pair<?, ?> p = (Pair<?, ?>) o;

		return ((car == null && p.car == null) || (car != null & car.equals(p.car)))
				&& ((cdr == null && p.cdr == null) || (cdr != null & cdr.equals(p.cdr)));

	}

	@Override
	public int hashCode() {
		return (car == null ? 0 : car.hashCode()) ^ (cdr == null ? 0 : cdr.hashCode());
	}

	@Override
	public String toString() {
		return asList().toString();
	}

	public List<Object> asList() {
		List<Object> l = new ArrayList<>();
		l.add(car);
		if (cdr instanceof Pair) {
			l.addAll(((Pair<?, ?>) cdr).asList());
		} else {
			l.add(cdr);
		}
		return l;
	}
}

class Tuple1<A> extends Pair<A, Object> {
	public Tuple1(A a) {
		super(a, null);
	}

	@Override
	public List<Object> asList() {
		List<Object> l = new ArrayList<>();
		l.add(car);
		return l;
	}

}

class Tuple2<A, B> extends Pair<A, Tuple1<B>> {
	public Tuple2(A a, B b) {
		super(a, new Tuple1<B>(b));
	}
}

class Tuple3<A, B, C> extends Pair<A, Tuple2<B, C>> {
	public Tuple3(A a, B b, C c) {
		super(a, new Tuple2<B, C>(b, c));
	}
}

class Tuple4<A, B, C, D> extends Pair<A, Tuple3<B, C, D>> {
	public Tuple4(A a, B b, C c, D d) {
		super(a, new Tuple3<B, C, D>(b, c, d));
	}
}

class Tuple5<A, B, C, D, E> extends Pair<A, Tuple4<B, C, D, E>> {
	public Tuple5(A a, B b, C c, D d, E e) {
		super(a, new Tuple4<B, C, D, E>(b, c, d, e));
	}
}

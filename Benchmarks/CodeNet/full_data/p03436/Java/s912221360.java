import java.util.Scanner;

public class Main {

	static int H, W;
	static char[][] map;
	static int[][] num;
	static myQueue<Point> que = new myQueue<Point>(10000);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		map = new char[H][W];
		num = new int[H][W];
		int periodCnt = 0;

		for (int i = 0; i < H; i++) {
			String temp = sc.next();
			for (int j = 0; j < W; j++) {
				map[i][j] = temp.charAt(j);
				if (map[i][j] == '.') {
					periodCnt++;
				}
			}

		}
		que.offer(new Point(0, 0));
		num[0][0] = 0;
		map[0][0] = 'x';

		while (!que.isEmpty()) {
			Point a = que.poll();
			int n = num[a.x][a.y] + 1;

			solve(a.x + 1, a.y, n);
			solve(a.x - 1, a.y, n);
			solve(a.x, a.y + 1, n);
			solve(a.x, a.y - 1, n);
		}

		if (map[H - 1][W - 1] != 'x') {
			System.out.println(-1);
		} else {
			System.out.println(periodCnt - num[H - 1][W - 1] - 1);
		}
		sc.close();
	}

	public static void solve(int x, int y, int n) {
		if (x < 0 || H <= x || y < 0 || W <= y || map[x][y] == '#' || map[x][y] == 'x') {
			return;
		}
		map[x][y] = 'x';
		num[x][y] = n;
		que.offer(new Point(x, y));
	}


	static class Point {
		int x;
		int y;
		Point (int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static class myQueue<T> {
		private Object[] values;
		private int head = 0;
		private int tail = 0;

		myQueue(int size) {
			values = new Object[size+1];
		}

		boolean offer(T data) {
			if (data == null)
				return false;
			if (((tail + 1) % values.length) == head) {
				return false;
			}
			values[tail++] = data;
			tail = tail % values.length;
			return true;
		}

		T poll() {
			T data = null;
			if (tail != head) {
				data = (T) values[head++];
				head = head % values.length;
			}
			return data;
		}

		boolean isEmpty() {
			return (tail == head);
		}
	}
}

import java.util.Scanner;
import java.util.Stack;

public class Main {

	static final boolean debugMode = true;
	static final int[][] dir = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };
	static char[][] map = new char[10][10];
	static int[][] countMap = new int[10][10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		int i = 0;
		while(x <=y) {
			x *= 2;
			i++;
		}
		System.out.println(i);
		sc.close();
	}

	static void dfs(Stack<Pair> stack, int depth) {
		Pair p = stack.pop();
		for (int[] d : dir) {
			int x = p.getX() + d[0];
			int y = p.getY() + d[1];

			// out of range
			if (x < 0 || x > 9 || y < 0 || y > 9)
				continue;
			// bridge
			int newDep = depth;
			if (map[x][y] == 'x')
				newDep++;
			// update only if fewer
			if (depth >= countMap[x][y] || depth >= 2)
				continue;

			log(String.format("x: %d, y: %d, depth: %d", x, y, newDep));
			countMap[x][y] = newDep;
			stack.add(new Pair(x, y));
			dfs(stack, newDep);
		}
	}

	static int readInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	static void log(String s) {
		if (debugMode) {
			System.out.println(s);
		}
		return;
	}

}

class Pair {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Pair() {

	}

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

import java.util.Scanner;
import java.util.Stack;

public class Main {

	static final boolean debugMode = true;
	static final int[][] dir = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };
	static char[][] map = new char[10][10];
	static int[][] countMap = new int[10][10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		boolean[] list = new boolean[s.length()];
		for (int i = 0; i < s.length(); i++) {
			list[i] = s.charAt(i) == '0' ? false : true;
		}

		int k = s.length();
		int min;
		while (k >= s.length() / 2) {
			min = s.length() - k;
			boolean start = list[min];
			boolean result = true;
			for (int i = min; i < k; i++) {
				if (start != list[i]) {
					result = false;
				}
			}

			if (result)
				break;

			k--;
		}
		System.out.println(k);
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

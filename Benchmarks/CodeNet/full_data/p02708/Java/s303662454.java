import java.util.Scanner;

public class Main {

	static final boolean debugMode = false;

	static final long DIV_INF = 1000000007l;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = readLong(sc);
		long k = readLong(sc);

		long cnt = 0;

		for (long i = k; i <= n + 1; i++) {

			cnt = modPlus(cnt, (n * i - i * i + i + 1l), DIV_INF);
		}

		System.out.println(cnt % 1000000007l);

	}

	static long modPlus(long a, long b, long div) {
		return a + b > div ? (a + b) % div : a + b;
	}

	// con.) a >= b
	static int gcm(int a, int b) {
		while (true) {
			if (b == 0)
				break;

			int mod = a % b;
			a = b;
			b = mod;
		}
		return a;
	}

	// con.) a >= b
	static int lcm(int a, int b) {
		return a * b / gcm(a, b);
	}

	static int readInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	static Long readLong(Scanner sc) {
		return Long.parseLong(sc.next());
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

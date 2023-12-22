import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	static final boolean debugMode = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = readInt(sc);
		int m = readInt(sc);

		int c = 0;
		for (int i = 0; i < m; i++) {
			c += readInt(sc);
		}

		System.out.println(n - c >= 0 ? n - c : -1);

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

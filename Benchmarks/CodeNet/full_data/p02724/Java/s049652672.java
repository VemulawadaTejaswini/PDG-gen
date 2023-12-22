package paiza;

import java.util.Scanner;

public class Main {

	static final boolean debugMode = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = readInt(sc);
		int a = x / 500;
		x -= 500 * a;
		int b = x / 5;
		System.out.println(a * 1000 + b * 5);

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
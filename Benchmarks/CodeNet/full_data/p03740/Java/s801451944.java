import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long X;
		X = sc.nextLong();
		long Y;
		Y = sc.nextLong();
		solve(X, Y);
	}

	static void solve(long X, long Y) {
		if (Math.abs(X - Y) <= 1) {
			System.out.println("Brown");
		} else {
			System.out.println("Alice");
		}

	}
}

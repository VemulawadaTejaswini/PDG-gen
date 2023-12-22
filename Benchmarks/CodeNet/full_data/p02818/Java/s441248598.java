
// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		long nA = Math.max(0, A - K);
		long nB = Math.max(0, B - Math.max(K - A, 0));
		System.out.println(nA + " " + nB);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase

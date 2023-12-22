import java.io.*;
import java.util.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A >= 10 || B >= 10) {
			System.out.println(-1);
		} else {
			System.out.println(A * B);
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}

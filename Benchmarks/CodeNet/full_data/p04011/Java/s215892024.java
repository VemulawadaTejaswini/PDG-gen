import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int start = N <= K ? N*X : K*X;
		int over = max(0, Y*(N-K));
		System.out.println(start+over);
		
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
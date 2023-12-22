import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		for(int i=0;i<S.length();++i) {
			System.out.print("x");
		}
		System.out.println();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}

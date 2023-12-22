
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		boolean ans = true;
		for (int i = 0; i < s.length; i += 2) {
			ans &= s[i]=='R' || s[i]=='U' || s[i]=='D';
		}
		for (int i = 1; i < s.length; i += 2) {
			ans &= s[i]=='L' || s[i]=='U' || s[i]=='D';
		}
		System.out.println(ans ? "Yes" : "No");
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}

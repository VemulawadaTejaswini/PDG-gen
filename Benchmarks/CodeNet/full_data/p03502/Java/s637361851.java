import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = new char[s.length()];
		c = s.toCharArray();
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			sum += c[i] - '0';
		}
		int n = Integer.parseInt(s);
		if(n%sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int l = (n-1)/2;
		int r = n/2;
		char c = s.charAt(l);
		while(0 <= l) {
			if(s.charAt(l) == c && s.charAt(r) == c) {
				l--; r++;
			}else {
				break;
			}
		}
		System.out.println(r);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
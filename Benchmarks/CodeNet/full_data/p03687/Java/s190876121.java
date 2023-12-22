import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;


	boolean check(String s, char c) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != c) {
				return false;
			}
		}
		return true;
	}

	int f(String s, char c) {
		if(check(s,c)) {
			return 0;
		}

		StringBuffer sb = new StringBuffer();

		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) == c || s.charAt(i+1) == c) {
				sb.append(c);
			}else {
				sb.append(s.charAt(i));
			}
		}

		return f(sb.toString(), c) + 1;

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();

		sc.close();

		int ans = Integer.MAX_VALUE;

		for(char c='a';c<='z';c++) {
			ans = Math.min(ans, f(s,c));
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

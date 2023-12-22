import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final String S = sc.next();
		for(int i=0;i<S.length();i+=2) {
			final char c = S.charAt(i);
			// 0文字目＝1文字目なので奇数
			if(c == 'L') {
				out.println("No");
				return;
			}
		}
		for(int i=1;i<S.length();i+=2) {
			final char c = S.charAt(i);
			// 1文字目＝2文字目なので奇数
			if(c == 'R') {
				out.println("No");
				return;
			}
		}
		out.println("Yes");
	}

}

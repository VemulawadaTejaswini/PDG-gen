import java.io.PrintStream;
import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintStream so = System.out;
	public static void main(String[] args) {

		String s = sc.next();
		
		String[] a = {"dreameraser", "dreamerase", "dreamer", "dream", "eraser", "erase"};
		
		outer: while (true) {
			for (String elem: a) {
				if (s.startsWith(elem)) {
					s = s.substring(elem.length());
					if (s.length() == 0) {
						so.println("Yes");
						return;
					}
					continue outer;
				}
			}
			
			so.println("No");
			return;
		}
	}
}

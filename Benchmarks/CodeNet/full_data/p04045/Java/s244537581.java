import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		String[] b = new String[k];
		for (int i = 0; i < k; i++) {
			b[i] = sc.next();
		}
		
		for (int i = n; ; i++) {
			if (!containtsDigit(i, b)) {
				so.println(i);
				return;
			}
		}
	}
	
	static boolean containtsDigit(final int in, final String[] digits) {
		return Stream.of(digits).anyMatch(s -> String.valueOf(in).contains(s));
	}
}

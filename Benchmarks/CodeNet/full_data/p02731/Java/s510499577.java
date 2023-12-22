import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		double L = in.nextInt();
		double l = L / 3;
		System.out.println(BigDecimal.valueOf(l*l*l).toPlainString());
	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}
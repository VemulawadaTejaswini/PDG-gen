import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		x1 -= x2;
		y1 -= y2;
		
		int x3 = y1 + x2;
		int y3 = -x1 + y2;
		x1 += x2;
		y1 += y2;
		
		x2 -= x3;
		y2 -= y3;
//		pr.printf("%d %d %d %d\n", x2, y2, x3, y3);
		int x4 = y2 + x3;
		int y4 = -x2 + y3;
		
		pr.printf("%d %d %d %d\n", x3, y3, x4, y4);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}

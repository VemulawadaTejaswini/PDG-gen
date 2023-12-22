import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int h = Integer.parseInt(sc.next());
		sc.next();
		for (int i = 0; i < h; i++) {
			String c = sc.next();
			out.println(c);
			out.println(c);
		}
		out.flush();
	}
}
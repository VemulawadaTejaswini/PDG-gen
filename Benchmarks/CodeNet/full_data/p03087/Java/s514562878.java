
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		String subStr = "";
		PrintWriter out = new PrintWriter(System.out);
		for (int k = 0; k < q; k++) {
			subStr = str.substring(sc.nextInt() - 1, sc.nextInt());
			out.println((subStr.length() - subStr.replaceAll("AC", "").length()) / 2);
		}
	}
}
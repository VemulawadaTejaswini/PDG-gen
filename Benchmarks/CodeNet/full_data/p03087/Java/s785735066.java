
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		String str = sc.next();
		String subStr = "";
		for (int k = 0; k < q; k++) {
			subStr = str.substring(sc.nextInt() - 1, sc.nextInt());
			System.out.println((subStr.length() - subStr.replaceAll("AC", "").length()) / 2);
			System.gc();
		}
	}
}
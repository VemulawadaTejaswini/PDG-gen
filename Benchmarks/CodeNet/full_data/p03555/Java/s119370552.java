import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		String d = sc.next();
		char c1 = c.charAt(0);
		char c2 = c.charAt(1);
		char c3 = c.charAt(2);
		char d1 = d.charAt(0);
		char d2 = d.charAt(1);
		char d3 = d.charAt(2);
		boolean ans = true;
		if (c1 != d3 || c2 != d2 || c3 != d1) {
			ans = false;
		}
		System.out.println(ans ? "YES" : "NO");
	}

}

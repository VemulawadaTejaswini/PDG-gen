import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int a = sc.nextInt() - 1;
		int b = sc.nextInt() - 1;
		int c = sc.nextInt() - 1;
		int d = sc.nextInt() - 1;
		String str = sc.next();
		boolean ok = true;
		ok &= str.substring(a, c + 1).indexOf("##") == -1;
		ok &= str.substring(b, d + 1).indexOf("##") == -1;
		if(c > d) {
			ok &= str.substring(Math.max(0, b - 1), Math.min(len, d + 2)).indexOf("...") != -1;
		}
		System.out.println(ok ? "Yes" : "No");
	}
}
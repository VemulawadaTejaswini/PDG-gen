import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String o = sc.next();
		String e = sc.next();
		int ol = o.length();
		int el = e.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i < ol;i++) {
			sb.append(o.substring(i,i+1));
			if (i<el) sb.append(e.substring(i,i+1));
		}
		System.out.println(sb.toString());
	}
}

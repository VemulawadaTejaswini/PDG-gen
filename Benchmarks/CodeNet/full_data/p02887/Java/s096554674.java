import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);
		for (int i = sb.length() - 2; i >= 0; i--) {
			if (sb.charAt(i) == sb.charAt(i + 1)) {
				sb.delete(i + 1, i + 2);
			}
		}
		System.out.println(sb.length());
		sc.close();
	}
}
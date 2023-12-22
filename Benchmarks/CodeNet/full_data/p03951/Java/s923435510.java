import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		sc.close();

		for (int i = n; i >= 0; i--) {
			if (s.endsWith(t.substring(0, i))) {
				System.out.println(i + (n - i) * 2);
				return;
			}
		}
	}
}

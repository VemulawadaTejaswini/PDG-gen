import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		sc.close();

		for (int i = 0; i < n; i++) {
			System.out.print(s.charAt(i));
			System.out.print(t.charAt(i));
		}
		System.out.println();
	}
}

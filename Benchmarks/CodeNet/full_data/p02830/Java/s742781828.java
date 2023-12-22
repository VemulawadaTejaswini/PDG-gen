import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		String ans = "";

		for (int i = 0; i < n; i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			ans = ans + c1 + c2;
		}

		System.out.println(ans);

		sc.close();
	}

}
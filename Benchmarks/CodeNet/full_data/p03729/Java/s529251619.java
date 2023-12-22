import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		char C = sc.next().charAt(0);
		boolean ans = false;
		char A = a.charAt(a.length()-1);
		char B1 = b.charAt(0);
		char B2 = b.charAt(b.length()-1);

		if(A == B1 && B2 == C) {
			ans = true;
		}
		System.out.println(ans ? "YES" : "NO");
	}
}

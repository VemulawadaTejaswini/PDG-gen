import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] a = scan.next().toCharArray();
		char[] b = scan.next().toCharArray();
		char[] c = scan.next().toCharArray();
		int A = 0;
		int B = 0;
		int C = 0;
		char x = a[A];
		String ans = "";
		while (true) {
			if (x == 'a') {
				A++;
				if (A==a.length) {
					ans = "A";
					break;
				}
				x = a[A];
			}
			if (x == 'b') {
				B++;
				if (B==b.length) {
					ans = "B";
					break;
				}
				x = b[B];
			}
			if (x == 'c') {
				C++;
				if (C==c.length) {
					ans = "C";
					break;
				}
				x = c[C];
			}
		}
		System.out.println(ans);
	}
}

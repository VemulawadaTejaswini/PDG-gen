import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		in.nextLine();
		String s = in.nextLine();

		int pass = 0;
		int overseaPass = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'c') {
				System.out.println("NO");
			} else if (s.charAt(i) == 'a') {
				if (pass < a + b) {
					System.out.println("YES");
					pass++;
				} else {
					System.out.println("NO");
				}
			} else if (s.charAt(i) == 'b') {
				if (pass < a + b && overseaPass < b) {
					System.out.println("YES");
					pass++;
					overseaPass++;
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}

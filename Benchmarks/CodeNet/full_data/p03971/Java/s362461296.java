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
			if (i == n - 1) {
				if (s.charAt(i) == 'c') {
					System.out.print("No");
				} else if (s.charAt(i) == 'a') {
					if (pass < a + b) {
						System.out.print("Yes");
						pass++;
					} else {
						System.out.print("No");
					}
				} else if (s.charAt(i) == 'b') {
					if (pass < a + b && overseaPass < b) {
						System.out.print("Yes");
						pass++;
						overseaPass++;
					} else {
						System.out.print("No");
					}
				}
			} else {
				if (s.charAt(i) == 'c') {
					System.out.println("No");
				} else if (s.charAt(i) == 'a') {
					if (pass < a + b) {
						System.out.println("Yes");
						pass++;
					} else {
						System.out.println("No");
					}
				} else if (s.charAt(i) == 'b') {
					if (pass < a + b && overseaPass < b) {
						System.out.println("Yes");
						pass++;
						overseaPass++;
					} else {
						System.out.println("No");
					}
				}
			}
		}
	}
}

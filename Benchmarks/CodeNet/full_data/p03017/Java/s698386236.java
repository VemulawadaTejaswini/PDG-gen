import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String s = sc.next();
		boolean xx = false;
		boolean xxx = false;
		if (c < d) {
			for (int i = b; i <= d; i++) {
				if (i == b) {
					if (i == d) {
						break;
					} else if (s.charAt(i) == '.') {
						b += 1;
					} else if (s.charAt(i+1) == '.') {
						b += 2;
					} else {
						System.out.println("No");
						return;
					}
				}
			}
			for (int i = a; i <= b; i++) {
				if (i == a) {
					if (i == b) {
						System.out.println("Yes");
						return;
					} else if (s.charAt(i) == '.') {
						a += 1;
					} else if (s.charAt(i+1) == '.') {
						a += 2;
					} else {
						System.out.println("No");
						return;
					}
				}
			}
		} else {
			for (int i = b; i <= d; i++) {
				if (i == b) {
					if (i == d) {
						if (s.charAt(i-2) == '.' && s.charAt(i) == '.') {
							xxx = true;
						}
						break;
					} else if (s.charAt(i) == '.') {
						b += 1;
						if (!xx) {
							xx = true;
						} else {
							xxx = true;
						}
					} else if (s.charAt(i+1) == '.') {
						b += 2;
						xx = false;
					} else {
						System.out.println("No");
						return;
					}
				}
			}
			if (!xxx) {
				System.out.println("No");
				return;
			}
			for (int i = a; i <= b; i++) {
				if (i == a) {
					if (i == b) {
						break;
					} else if (s.charAt(i) == '.') {
						a += 1;
					} else if (s.charAt(i+1) == '.') {
						a += 2;
					} else {
						System.out.println("No");
						return;
					}
				}
			}
			for (int i = d; i <= c; i++) {
				if (i == d) {
					if (i == c) {
						System.out.println("Yes");
						return;
					} else if (s.charAt(i) == '.') {
						d += 1;
					} else if (s.charAt(i+1) == '.') {
						d += 2;
					} else {
						System.out.println("No");
						return;
					}
				}
			}
		}
	}
}

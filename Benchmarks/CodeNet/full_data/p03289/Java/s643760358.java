import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char s[] = sc.next().toCharArray();
		boolean b = true;
		if (s[0] == 'A') {
			for (int i = 1; i < s.length; i++) {
				if (i == 2 || i == s.length - 2) {
					if ((s[i] >= 'a' && s[i] <= 'z') || s[i] == 'C') {
					} else {
						b = false;
						break;
					}
				} else {
					if (s[i] >= 'a' && s[i] <= 'z') {
					} else {
						b = false;
						break;
					}
				}
			}
			if ((s[2] == 'C' && s[s.length - 2] != 'C')
					|| (s[2] != 'C' && s[s.length - 2] == 'C')) {
			} else {
				b = false;
			}
		} else {
			b = false;
		}
		if (b) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
	}
}

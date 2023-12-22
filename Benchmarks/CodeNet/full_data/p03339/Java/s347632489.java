

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char c[] = S.toCharArray();
		int count = 0;
		int r = 0;
		int l = 0;
		int p1 = 0;
		int p2 = N - 1;
		while (true) {
			if (c[p1] == 'W' && c[p2] == 'E') {
				l++;
				r++;
				p1++;
				p2--;
			} else if (c[p1] == 'E' && c[p2] == 'W') {
				p1++;
				p2--;
			} else if (c[p1] == 'W' && c[p2] == 'W') {
				l++;
				p2--;
			} else if (c[p1] == 'E' && c[p2] == 'E') {
				r++;
				p1++;
			}
			if (p2 - p1 <= 1) {
				break;
			}
		}
		int ans = l > r ? r : l;
		System.out.println(ans);
	}
}

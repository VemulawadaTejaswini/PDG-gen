import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		if(n < 5 && n >= 10) {
			System.out.println("NO");
			return;
		}
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) != 'A' && s.charAt(i) != 'K' && s.charAt(i) != 'H' && s.charAt(i) != 'B'&& s.charAt(i) != 'R' && s.charAt(i) != 'I') {
				System.out.println("NO");
				return;
			}
		}
		// チェック様
		for(int i = 0 ; i < n ; i++) {
			for(int j = i + 1 ; j < n ; j++) {
				for(int k = j + 1 ; k < n ; k++) {
					for(int l = k + 1 ; l < n ; l++) {
						for(int x = l + 1 ; x < n ; x++) {
							if(s.charAt(i) == 'A' && s.charAt(j) == 'A' && j == i + 1 || s.charAt(j) == 'A' && s.charAt(k) == 'A' && k == j + 1|| s.charAt(k) == 'A' && s.charAt(l) == 'A' && l == k + 1 || s.charAt(l) == 'A' && s.charAt(x) == 'A' && x == l + 1) {
								System.out.println("NO");
								return;
							}
							if((s.charAt(i) == 'K' && s.charAt(j) == 'A' && j == i + 1) || (s.charAt(i) == 'I' && s.charAt(j) == 'A' && j == i + 1)) {
								System.out.println("NO");
								return;
							}
						}
					}
				}
			}
		}
		for(int i = 0 ; i < n ; i++) {
			for(int j = i + 1 ; j < n ; j++) {
				for(int k = j + 1 ; k < n ; k++) {
					for(int l = k + 1 ; l < n ; l++) {
						for(int x = l + 1 ; x < n ; x++) {
							if(s.charAt(i) == 'A' || s.charAt(j) == 'A' || s.charAt(k) == 'A' || s.charAt(l) == 'A' || s.charAt(x) == 'A') {
								continue;
							}
							if(s.charAt(i) == 'K' && s.charAt(j) == 'I' && s.charAt(k) == 'H' && s.charAt(l) == 'B' && s.charAt(x) == 'R') {
								System.out.println("YES");
								return;
							}
						}
					}
				}
			}
		}
		System.out.println("NO");
	}
}

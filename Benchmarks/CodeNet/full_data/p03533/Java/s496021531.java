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
			for(int j = i + 1 ; j < n ; j++) {
				for(int k = j + 1 ; k < n ; k++) {
					for(int l = k + 1 ; l < n ; l++) {
						for(int x = l + 1 ; x < n ; x++) {
							if(s.charAt(i) == 'A' && s.charAt(j) == 'A') {
								System.out.println("NO");
								return;
							}
							if((s.charAt(i) == 'K' && s.charAt(j) == 'A') || (s.charAt(i) == 'I' && s.charAt(j) == 'A')) {
								System.out.println("NO");
								return;
							}
							if(s.charAt(i) == 'A' || s.charAt(j) == 'A' || s.charAt(k) == 'A' || s.charAt(l) == 'A' || s.charAt(x) == 'A') {
								continue;
							}
							if(s.charAt(i) == 'K' && s.charAt(j) == 'I' && s.charAt(k) == 'H' && s.charAt(l) == 'B' && s.charAt(x) == 'R') {
								System.out.println("YES");
								return;
							} else {
								System.out.println("NO");
								return;
							}
						}
					}
				}
			}
		}
	}
}

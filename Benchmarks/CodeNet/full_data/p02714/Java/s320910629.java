import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 0;
		int r = 0;
		int g = 0;
		int b = 0;

		for(int i = 0; i < s.length(); i++) {
			if('R'==s.charAt(i)) {
				r++;
			}else if('G'==s.charAt(i)) {
				g++;
			}else if('B'==s.charAt(i)) {
				b++;
			}
		}

		long num = r * g * b;
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i; j < s.length(); j++) {
				for(int k = j; k < s.length(); k++) {
					if(j - i == k -j) {
						if( (s.charAt(i) != s.charAt(j)) && (s.charAt(i) != s.charAt(k) && (s.charAt(j) != s.charAt(k))) ) {
							ans++;
						}
					}
				}
			}
		}

		System.out.println(num - ans);
		sc.close();
	}

}
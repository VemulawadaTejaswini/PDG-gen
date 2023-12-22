import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long cnt = 0;
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
			for(int j = i + 1; j < s.length(); j++) {
				if(s.length() <= 2 * j - i  
						|| 2 * j - i < j) {
					continue;
				}
				
				if( s.charAt(i) != s.charAt(j) 
						&& s.charAt(i) != s.charAt(2 * j - i) 
						&& s.charAt(j) != s.charAt(2 * j - i) 
					) {
					cnt++;
				}
			}
		}

		System.out.println(num - cnt);
		sc.close();
	}

}
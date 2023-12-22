
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		String[] s = new String[n];
		
		int count = 0;
		int startFromB =0;
		int endWithA =0;
		int B_A = 0;
		
		for(int i = 0 ; i < n ; i++) {
			s[i] = sc.next();
			
			count += countAB(s[i]);
			
			if(s[i].charAt(0) == 'B') {
				startFromB ++;
			}
			if(s[i].charAt(s[i].length()-1) == 'A') {
				endWithA ++;
			}

			if(s[i].charAt(0) == 'B') {
				if(s[i].charAt(s[i].length()-1) == 'A') {
					B_A++;
				}
			}				
		}
		
		
		int byConcat = Math.min(Math.min(startFromB, endWithA), n-1) ;

		if(Math.max(startFromB, endWithA) == B_A) {
			byConcat = Math.max(0, B_A - 1);
		}
		
		System.out.println(count +byConcat);
		
	}
	
	int countAB(String str) {
		int res = 0;
		int flg = 0;
		for(char ch : str.toCharArray()) {
			if(flg == 0) {
				if(ch == 'A') {
					flg = 1;
				}else {
					flg = 0;
				}
			}else {
				if(ch == 'B') {
					res++;
				}
				if(ch != 'A') {
					flg = 0;
				}
				
			}
		}
		return res;
	}
}

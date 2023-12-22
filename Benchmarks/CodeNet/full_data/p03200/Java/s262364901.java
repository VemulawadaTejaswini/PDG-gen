
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[]s  = sc.next().toCharArray();
		
		int n = s.length;
		
		int ans = 0;
		
		for(int i = 0 ; i < n-1 ;i++) {
			if(s[i] == 'B' && s[i+1] == 'W') {
				ans++;
				s[i] = 'W';
				s[i+1] = 'B';
			}
		}
		
		for(int i = n-1 ; i > 0 ;i--) {
			if(s[i] == 'B' && s[i-1] == 'W') {
				ans++;
				s[i] = 'W';
				s[i-1] = 'B';
			}
		}
		
		System.out.println(ans);
		
	}

}

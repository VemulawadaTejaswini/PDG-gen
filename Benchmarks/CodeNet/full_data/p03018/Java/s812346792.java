
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[]s = sc.next().toCharArray();
		int n =  s.length;
		int ans = 0;
		int alen = 0;
		for(int i = 0 ; i < n-2 ;i++) {
			if(s[i] == 'A' && s[i+1] == 'B' && s[i+2] == 'C') {
				ans++;
				s[i]++; s[i+1]++; s[i+2] -= 2;
				if(i == 0)continue;
				
				ans += alen;
				alen = 0;
		}
			else if(s[i] == 'A') alen++;
			else {
				alen = 0;
			}
		}
			System.out.println(ans);
	}

}

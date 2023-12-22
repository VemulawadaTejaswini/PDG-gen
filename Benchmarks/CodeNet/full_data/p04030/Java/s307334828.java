
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int p = 0; 
		char ans[];
		ans = new char[s.length()];		
		
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == 'B') {
				if(p != 0)--p;
				ans[p] = '\0';
			}
			else ans[p++] = s.charAt(i);
		}
		
		String ans1 = "";
		for(char c:ans) {
			if(c == '\0')break;
			ans1 += c;
		}
		
		System.out.println(ans1);
		sc.close();
	}

}

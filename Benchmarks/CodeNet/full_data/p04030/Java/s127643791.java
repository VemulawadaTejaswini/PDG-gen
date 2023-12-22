
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int p = 0; 
		char ans[];
		ans = new char[s.length()];
		//System.out.println(s.length());
		
		for(int i = 0; i < s.length();++i) {
			if(s.charAt(i) == 'B') {
				if(p != 0)--p;
				ans[p] = ' ';
			}
			else ans[p++] = s.charAt(i);
			//System.out.println(p);
		}
		
		for(char c: ans)
		System.out.print(c);
		
		System.out.println();
		sc.close();
	}

}

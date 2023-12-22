import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //n個後の文字
		String s = stdIn.next(); //文字列S
		if(n==0) {
			System.out.println(s);
		}
		char[] ans = new char[s.length()];

		for(int i = 0; i < s.length();i++) {
		ans[i] =s.charAt(i);
		}
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < s.length(); j++) {
				if(ans[j] == 'Z') {
					ans[j] ='A';
				}else {
				
					(ans[j])++;
				}
			
			}
		}
		
		for(char a: ans) {
			System.out.print(a);
		}
	}

}

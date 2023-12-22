import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static int N = scan.nextInt();
	static int count = 0;
	public static void main(String[]args) {
		
		ken("3");
		ken("5");
		ken("7");
		
		System.out.println(count);
		
		
		
	}
	
	
	
	private static void ken(String s) {
		if(N>=Long.valueOf(s)) {
			char []c = new char[s.length()];
			c = s.toCharArray();
			int t = 0;int f = 0;int n = 0;
			for(int i = 0;i<s.length();i++) {
				if(c[i]=='3')t++;
				if(c[i]=='5')f++;
				if(c[i]=='7')n++;
				}
			
			if(t>=1&&f>=1&&n>=1)count++;
			ken(s+'3');
			ken(s+'5');
			ken(s+'7');
			
		}
		
	
		
	}
}

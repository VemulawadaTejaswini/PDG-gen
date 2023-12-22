import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner can = new Scanner(System.in);
		String kaibun = can.next();
		char bunkai[] = new char[kaibun.length()];
		
		String zenhan = kaibun.substring(0, (kaibun.length() - 1) / 2 );
		String kouhan = kaibun.substring((kaibun.length() - 1)/ 2 + 1);
		
		if(!zenhan.equals(kouhan)) {
			System.out.println("no");
			System.exit(0);
			
		}
		
		for(int i = 0; i < zenhan.length(); i++) {
			bunkai[i] = zenhan.charAt(i);
			
		}
		
		for(int i = 0; i < (zenhan.length() - 1) / 2; i++) {
			if(bunkai[i] != bunkai[zenhan.length() - 1 - i]) {
				System.out.println("no");
				System.exit(0);
				
			}
			
		}
		
		System.out.println("yes");
		
		
	}
	
}
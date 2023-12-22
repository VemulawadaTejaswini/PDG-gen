
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		if(s.length()%2!=0) {
			System.out.print("No");
			System.exit(0);
		}
		
		for(int i=0; i<s.length(); i+=2) {
			if(s.charAt(i)=='h' && s.charAt(i+1)=='i') {
				continue;
			}else {
				System.out.print("No");
				System.exit(0);
			}
		}
		
		System.out.print("Yes");
	}
	
}

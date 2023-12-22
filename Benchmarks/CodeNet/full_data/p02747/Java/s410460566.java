import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean t = false;
		
		for(int i=0; i<s.length()-1; i++) {
			if(t == true) {
				break;
			}
				
			if(s.charAt(i)=='h'&&s.charAt(i+1)=='i') {
				t = true;
			}
		}
		if(t == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}

	
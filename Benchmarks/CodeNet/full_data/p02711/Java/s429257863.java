import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int i;
		for(i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '7') break;
		}	
		if(i < s.length()) System.out.println("Yes");
		else System.out.println("No");
	}
} 

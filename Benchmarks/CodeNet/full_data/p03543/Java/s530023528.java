import java.util.*;

public class Main {

	public static long answer = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		
		if ((s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) || 
			(s.charAt(1) == s.charAt(2) && s.charAt(2) == s.charAt(3))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

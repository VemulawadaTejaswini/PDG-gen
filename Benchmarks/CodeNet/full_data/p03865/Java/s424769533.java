import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int count =1;
		StringBuilder s2 = new StringBuilder();
		s2.append(s);
		if (s2.length()>=3) {
		while(s2.charAt(1)!= s2.charAt(0) && s2.charAt(0)!= s2.charAt(2) && s2.length()>=3) {	
			s2.deleteCharAt(1);
			count++;
			if (s2.length()<3) {
				break;
			}
		}
		}
		if(count %2==0) {
			System.out.println("First");
		}
		else {
			System.out.println("Second");
		}
    }
}
	


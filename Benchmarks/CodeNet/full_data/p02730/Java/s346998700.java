import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		StringBuffer sb = new StringBuffer(s);
		StringBuffer sbr = sb.reverse();
		if ( sbr.toString().equals(s) ) {
			String s1 = s.substring(0, (s.length()-1)/2);

			StringBuffer sb1 = new StringBuffer(s1);
			StringBuffer sbr1 = sb1.reverse();
			
			String s2 = s.substring((s.length()+1)/2);

			StringBuffer sb2 = new StringBuffer(s2);
			StringBuffer sbr2 = sb2.reverse();
			
			if ( sbr1.toString().equals(s1) && sbr2.toString().equals(s2) ) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}

	}
}
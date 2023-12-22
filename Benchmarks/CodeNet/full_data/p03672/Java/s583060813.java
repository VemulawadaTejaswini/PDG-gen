import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] sArray = s.split("");
		
		s = s.substring(0, s.length()-1);
		
		String s1 = null;
		String s2 = null;
		
		for(int i = 1; i <= s.length(); i++) {
			if(s.length() % 2 == 0) {
				s1 = s.substring(0, s.length()/2);
				s2 = s.substring(s.length()/2, s.length());
				if(s1.equals(s2)) {
				System.out.println(s.length());
				return;	
				}
		    }else {
		    	s = s.substring(0, s.length()-1);
		    } 
		 

		}

	}
}

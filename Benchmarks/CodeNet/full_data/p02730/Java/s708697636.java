import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			String s = sc.next();
			
			int width = (s.length() - 1)/2;
			
			boolean isStrong = checkCircle(s) && checkCircle(s.substring(0, width)) &&
					checkCircle(s.substring(width + 1, s.length()));
			
			System.out.println(isStrong ? "Yes" : "No");
		}
	}
	
	public static boolean checkCircle(String s) {
		
//		System.out.println(s);
		
		for(int i = 0  ; i < (s.length()) / 2 ; i++ ) {
//			System.out.println(s.charAt(i));
			if ( s.charAt(i) == s.charAt(s.length()-1-i)) {
				//ok
			}
			else {
				return false;
			}
		}
		return true;
	}

}